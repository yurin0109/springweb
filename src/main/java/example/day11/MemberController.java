package example.day11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    
    @GetMapping("")
    public String test( HttpServletRequest request ){
        // 1) HttpServletRequest : HTTP 요청이 들어오면 요청 정보가 담겨있는 객체
        System.out.println( request.getRemoteAddr() ); // 요청한 클라이언트의 IP
        System.out


        // 2) 세션객체란? 톰캣 서버내 브라우저 마다 독립적인 저장소
        // 주로 : *로그인성공정보*, 인증번호, 비회원저장바구니 등등 일시적인 휘발성 메모리
        HttpSession session = request.getSession(); // 세션객체내 여러개 정보 저장 가능
        System.out.println( session.getId() ); // 세션 식별번호
        System.out.println( session.getCreationTime )      

    }
}
