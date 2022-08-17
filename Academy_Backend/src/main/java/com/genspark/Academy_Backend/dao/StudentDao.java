package com.genspark.Academy_Backend.dao;
import com.genspark.Academy_Backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

    @Query(value="select s from Student s left join fetch s.career")
    List<Student> findAllStudent();

    @Query(value="select s from Student s left join fetch s.career where s.studentId=:id")
    Student findStudentById(int id);

    @Query(value="select s from Student s where s.email=:email")
    Student findStudentByEmail(String email);
}