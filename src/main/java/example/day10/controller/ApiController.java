package example.day10.controller;




@RestController
@RequiredArgsConstructor
@RequestMapping ("/api")
@CrossOrigin ("http://localhost:5173")
public class ApiController {

    private final ApiService apiService;

    @GetMapping("")
    public List<ApiDto> findAll(){
        return apiService.findAll();
    }
}

    @PostMapping("")
    public boolean save(@RequestBody ApiDto apiDto ){
        return apiService.save(apiDto);
    }
}