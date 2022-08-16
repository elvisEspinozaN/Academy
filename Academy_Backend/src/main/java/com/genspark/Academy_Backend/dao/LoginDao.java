package com.genspark.Academy_Backend.dao;

import com.genspark.Academy_Backend.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao  extends JpaRepository<Login, Integer> {

}
