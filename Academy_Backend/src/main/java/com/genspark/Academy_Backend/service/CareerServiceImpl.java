package com.genspark.Academy_Backend.service;
import com.genspark.Academy_Backend.dao.CareerDao;
import com.genspark.Academy_Backend.model.Career;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CareerServiceImpl implements CareerService{
    @Autowired
    CareerDao careerDao;
    @Override
    public List<Career> findAllCareer() {
        return careerDao.findAll();
    }
    @Override
    public Career findCareerById(int id) {
        Career c;
        Optional<Career> opt = careerDao.findById(id);

        if (opt.isPresent()){
            c = opt.get();
        }else{
            throw new RuntimeException("The career "+ id + " wasn't found");
        }

        return c;
    }
    @Override
    public Career createCareer(Career career) {
        return careerDao.save(career);
    }
    @Override
    public Career updateCareer(Career career) {
        return careerDao.save(career);
    }
    @Override
    public String deleteCareer(int id) {
        careerDao.deleteById(id);

        return "The career "+ id + "was deleted";
    }
}
