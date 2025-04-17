package in.vodafone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vodafone.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
