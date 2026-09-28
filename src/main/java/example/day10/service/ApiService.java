package example.day10.service;


@Service
@RequireArgsConstructor
@Transactional
public class ApiService {

    private final ApiRepository apiRepository;

    public List<ApiDto> findAll(){
        List<ApiEntity> apiEntities = apiRepository.findAll();

        List<ApiDto> apiDtos = apiEntities.stream().map( (entity)-> {return ApiDto.fron(entity);}).toList();

        return apiDtos;
    }
    public boolean save(ApiDto apiDto){
        ApiEntity apiEntity = apiDto.toEntity();
        ApiEntity saveed = apiRepository.save( apiEntity );
         if( saveed.getIdx() >= 1)
            return true;
    }
    return false;
}

}