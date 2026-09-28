package example.day0800;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor 
public class ApiController1 {
    private final ApiService1 apiService;
    // 1. 
    @GetMapping("/test1")
    public Map<String,Object> test1(){
        return apiService.test1();
    }
}
