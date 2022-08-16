package com.genspark.Academy_Backend.service;

import com.genspark.Academy_Backend.model.Career;

import java.util.List;

public interface CareerService {

    List<Career> findAllCareer();

    Career findCareerById(int id);

    Career createCareer(Career career);

    Career updateCareer(Career career);

    String deleteCareer(int id);
}
