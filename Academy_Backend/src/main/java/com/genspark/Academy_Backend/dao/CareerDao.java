package com.genspark.Academy_Backend.dao;

import com.genspark.Academy_Backend.model.Career;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerDao extends JpaRepository<Career, Integer> {

}
