package example.day0800;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class ApiService1 {
    // 서비스키 안전하게 application.properties 에서 관리, 즉] 프로젝트간 api키는 github push 하지말자!, notion/excel 에서 공유
    // @Value("${application.propertis속성명}")
    @org.springframework.beans.factory.annotation.Value("${api.public-data.service-key}")
    private String serviceKey;
    // 2. WebClient 객체 빌더패턴 생성 
    private WebClient webClient = WebClient.builder().build();
    // [1]. 관세청_관세환율정보(GW)
    public Map<String,Object> test1(){
        // 1. API 주소( 공공데이터 신청한 api 요청 url )
        String url = "https://apis.data.go.kr/1220000/retrieveTrifFxrtInfo/getRetrieveTrifFxrtInfo";
        url += "?serviceKey=" + serviceKey;       // 1. 첫 번째는 ?와 인증키
        url += "&aplyBgnDt=" + "20150101";        // 2. 조회 시작일
        url += "&weekFxrtTpcd=" + "2";            // 3. 주간 환율 구분 코드
        
        String response = webClient.get( ).uri( url ).retrieve()
                .bodyToMono(String.class) // XML 타입 --String타입 
                .block();
        // 4. String타입 -> xml 타입 변환 , 
        XmlMapper xmlMapper = new XmlMapper(); // xml매퍼 객체 생성
        // Map<String,Object> map = xmlMapper.readValue( xml문자열 , 타입명.class ); // +일반예외
        try{
            Map<String,Object> map = xmlMapper.readValue( response , Map.class );
            return  map;
        }catch( Exception e ){ System.out.println( e ); }
        return  null;
    }
}
