package com.genspark.Academy_Backend.model;
import javax.persistence.*;

@Entity
@Table(name="tbl_career")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="career_id")
    private int careerId;
    private String name;
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

    @Override
    public String toString() {
        return "Career{" +
                "careerId=" + careerId +
                ", name='" + name + '\'' +
                '}';
    }
}
