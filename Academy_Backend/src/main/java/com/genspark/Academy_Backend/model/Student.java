package com.genspark.Academy_Backend.model;
import javax.persistence.*;

@Entity
@Table(name="tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="career_id", referencedColumnName = "career_id")
    private Career career;

    public Student(){}

    public Student(String firstName, String lastName, String email, Career career) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.career = career;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", career=" + career +
                '}';
    }
}
