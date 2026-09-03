package example.Practice2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository< TestEntity , Integer > {
    // extends JpaRepository
    // 1. 기본 CRUD 제공 받는다. save() , findById() , findAll() , detleteById()
    // 2. 페이징/정렬 제공 받는다.
    // 3. 쿼리 커스템 제공 받는다.



}
