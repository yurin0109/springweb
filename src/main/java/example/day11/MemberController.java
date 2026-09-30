package example.day11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    // [1] 회원가입
    @PostMapping("/signup")
    public boolean signup( @RequestBody MemberDto memberDto ){
        return memberService.signup( memberDto );
    }
    // [2] 로그인 + 세션(인증 성공시 성공한 회원정보 저장/왜? 로그인 성공한 회원이 글쓰기/제품등록 등등 FK용도)
    @PostMapping("/login")
    public MemberDto login(@RequestBody MemberDto memberDto , HttpSession session){
        // 1. 서비스에게 인증 확인 한다.
        MemberDto result = memberService.login(memberDto);
        if( result == null ) return null; // 로그인실패
        // 2. 인증 성공이면 세션에 인증한 회원정보 담아주기.
        // - 매개변수에 HttpSession 객체 정의
        // - 'login_member' key(이름) 으로 memebrDto value(로그인성공한) 정보 저장
        session.setAttribute("login_member", result);
        return result;
        }
        // [3] 내정보조회 + 세션 ( 이미 로그인된 회원이 내정보 요청 )
        @GetMapping("/me")
        public MemberDto getMyInfo( HttpSession session ){
            // * 사용자에게 추가로 입력받을 값은 없다.
            // 1) 세션에서 특정한(login_member) 정보 꺼내기
            Object obj = session.getAttribute("login_member");
            if( obj == null ) return null; // 세션 정보가 비어 있으면 실패
            // 2) 존재하면 Object 다운캐스팅. obj -> dto
            MemberDto memberDto = (MemberDto)obj;
            // 3. 서비스에게 회원번호 전달하여 추가 정보 요청하여 반환한다.
            return memberService.getMyInfo(memberDto.getMno() );
        }

        // [4] 로그아웃 + 세션 ( 초기화 )
        @PostMapping ("/logout")
        public boolean logout( HttpSession httpSession ){
            //* 사용자에게 추가로 입력받을 값은 없다.
            httpSession.invalidate(); //선택1] 세션 내 모든 정보 초기화
            // httpSession.removeAttribute("login_member"); // 선택2] 세션 내 특정 정보 삭제
            return true;
        }

}
