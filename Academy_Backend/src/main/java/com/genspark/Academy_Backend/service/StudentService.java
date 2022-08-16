package com.genspark.Academy_Backend.service;

import com.genspark.Academy_Backend.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudent();

    Student findStudentById(int id);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    String deleteStudentById(int id);

    Student findStudentByEmail(String email);
}
