package example.미니프로젝트2DB설계;

import java.time.LocalDateTime;

import example.day05.TestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Builder @Data 
public class ProductDto {
    private Integer pno;
    private String pname;
    private Integer pprice;
    private boolean pstatus;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;


    // DTO -> Entity
    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .pname(this.pname)
                .pprice(this.pprice)
                .pstatus(this.pstatus)
                .build();
    }

    //Entity -> DTO
    public static ProductDto from(ProductEntity productEntity){
        return ProductDto.builder()
            .pno(productEntity.getPno())
            .pname(productEntity.getPname())
            .pprice(productEntity.getPprice())
            .pstatus(productEntity.isPstatus())
            .createDate(productEntity.getCreateDate())
            .updateDate(productEntity.getUpdateDate())
            .build();
    }


}