package com.genspark.Academy_Backend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tbl_career")
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="career_id")
    private int careerId;
    private String name;

    @OneToMany(mappedBy = "career")
    private List<Student> student;

    public Career(){}

    public int getCareerId() {
        return careerId;
    }

    public void setCareerId(int careerId) {
        this.careerId = careerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Career{" +
                "careerId=" + careerId +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
