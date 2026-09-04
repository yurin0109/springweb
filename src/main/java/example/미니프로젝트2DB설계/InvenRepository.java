package example.미니프로젝트2DB설계;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvenRepository extends JpaRepository<CategoryEntity,Integer> {
    
}
