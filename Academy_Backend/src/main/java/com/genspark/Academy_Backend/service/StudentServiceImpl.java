package com.genspark.Academy_Backend.service;
import com.genspark.Academy_Backend.dao.StudentDao;
import com.genspark.Academy_Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> findAllStudent() {
        return studentDao.findAllStudent();
    }
    @Override
    public Student findStudentById(int id) {
        return studentDao.findStudentById(id);
    }
    @Override
    public Student createStudent(Student student) {
        return studentDao.save(student);
    }
    @Override
    public Student updateStudent(Student student) {
        return null;
    }
    @Override
    public String deleteStudentById(int id) {
         studentDao.deleteById(id);

        return "The student "+ id + " was deleted";
    }
    @Override
    public Student findStudentByEmail(String email) {
        return studentDao.findStudentByEmail(email);
    }
}
