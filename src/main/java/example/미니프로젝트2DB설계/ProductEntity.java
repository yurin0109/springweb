package example.미니프로젝트2DB설계;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder@Getter
@Entity @Table (name="product")
public class ProductEntity extends BaseTime {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer pno;

    @Column (nullable = false)
    private String pname;

    @Column (nullable = false)
    private int pprice;

    @Column (nullable = false)
    private boolean pstatus;

    // FK
    @ManyToOne
    @JoinColumn (name = "cno")
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "productEntity")
    @ToString.Exclude
    @Builder.Default
    List<ManagementEntity> managementList = new ArrayList<>();

}

/*
*/
