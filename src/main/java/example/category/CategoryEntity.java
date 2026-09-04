package example.category;

import java.util.List;

import example.day06.BoardEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;


@Entity@Table( name = "category" )@NoArgsConstructor@AllArgsConstructor@Builder@Data
public class CategoryEntity extends CategoryBaseTime {
    @Id
    private Integer cno ;
    private String cname ; 

    // 양방향 참조
    // @OneToMany( mappedBy = "매핑할멤버변수" ) // 하나가 다수에게 참조
    @OneToMany( mappedBy = "categoryEntity" ) // 자바(JPA) 에서만 매핑연결
    @ToString.Exclude // 자바에서 양방향관계에서 순환참조 방지
    @Builder.Default // 만일 해당 entity
    private List<BoardEntity> boardList = new ArrayList<>();
}
