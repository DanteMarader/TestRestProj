package REST.TestRestProj.repositories;

import REST.TestRestProj.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findAllById(Long id);
    List<Student> findAllByNameContainsIgnoreCase(String name);
    List<Student> findAllByOrderByNameAsc();
}
