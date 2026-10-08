package example.day15;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import lombok.RequiredArgsConstructor;

@RestController @RequestMapping ("/api/sse")
@RequiredArgsConstructor @CrossOrigin( origins="*" )
public class NoticeController {
    private final NoticeService noticeService;
    // 1. 알림 구독 매핑
    // * 응답 Content-type JSON이 아닌 EVENT_STREAM 타입으로 변경
    // * MediaType 자동완성시 import org.springframework.http.MediaType;
    @GetMapping ( value = "/subscribe" , produces = MediaType )
    public SseEmitter subcribe(){
        return noticeService.subscribe();
    }
    // 2.
}
