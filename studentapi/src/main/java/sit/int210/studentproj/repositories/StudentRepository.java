package sit.int210.studentproj.repositories;

import sit.int210.studentproj.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, String>{   
}
