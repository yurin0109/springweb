package example.day14;

import example.Practice3.BaseTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "board")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BoardEntity extends BaseTime {
    private Long id;
    private String title;
    private String content;
    private String fileName;
}
