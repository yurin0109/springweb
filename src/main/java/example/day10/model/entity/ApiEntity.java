package example.day10.model.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class ApiEntity {



// board (idx, subject, name, regdate, content)
    @Id
    @Table (name="board")
    @Data 
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class ApiEntity {

    board (idx, subject, name, regdate, content)
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer idx;

        @Column
        private String subject;

        @Column
        private String name;

        @Column
        private String regdate;

        @Column
        private String content;
    }








}

