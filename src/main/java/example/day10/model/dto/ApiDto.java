package example.day10.model.dto;



@AllArgsConstructor
@Data
@NoArgsConstructor
@Bulider
public class ApiDto {
    private Integer idx;
    
    private String subject;

    private String name;

    private String regdate;

    private String content;

    public static ApiDto from(ApiEntity apiEntity){

        return ApiDto.builder()
            .idx( apiEntity.getIdx() )
            .subject( apiEntity.getSubject() )
            .name(apiEntity.getName())
            .regdate(apiEntity.getContent())
            .content(apiEntity.getContent())
            .build();
    }
    public ApiEntity toEntity(){
        return ApiEntity.builder()
            .name(name).content(content)
            .subject(subject).regdate( LocalDateTime.now().toString())
            build();
    }
}
