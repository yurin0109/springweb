package example.day15;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Data @Builder 
public class MessageDto {
    private String type; // 메시지 형식 , TALK 메시지 / ENTER 접속
    private String roomId; // 방 번호
    private String sender; // 보낸 사람
    private String content; // 보낸 내용
    private String date; // 보낸 시간
    
}
