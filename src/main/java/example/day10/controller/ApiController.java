package example.day10.controller;

public class ApiController {

    private final ApiService apiService;

    @GetMapping("")
    public List<ApiDto> findAll(){
        return apiService.findAll();
    }
}
