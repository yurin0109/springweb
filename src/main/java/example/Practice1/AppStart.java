package example.Practice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // 1. 톰캣 2. 컴포넌트(MVC클래스) 스캔
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run( AppStart.class );


// 게시물 등록

// 게시물 전체조회


// 게시물 개별조회

// 게시물 삭제


// 게시물 수정


    }
}
