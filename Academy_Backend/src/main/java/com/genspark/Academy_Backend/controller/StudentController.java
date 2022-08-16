package com.genspark.Academy_Backend.controller;
import com.genspark.Academy_Backend.model.Student;
import com.genspark.Academy_Backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String home(){
        return "<html><h1>Welcome to our Academy Application</h1><html>";
    }

    @GetMapping("/students")
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable int id){
        return studentService.findStudentById(id);
    }

    @GetMapping("/email/{email}")
    public Student findStudentByEmail(@PathVariable String email){

        return studentService.findStudentByEmail(email);
    }
}
