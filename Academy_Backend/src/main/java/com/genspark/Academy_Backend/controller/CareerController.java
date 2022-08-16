package com.genspark.Academy_Backend.controller;
import com.genspark.Academy_Backend.model.Career;
import com.genspark.Academy_Backend.service.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CareerController {

    @Autowired
    CareerService careerService;

    @GetMapping("/careers")
    public List<Career> findAllCareer(){
        return careerService.findAllCareer();
    }

    @GetMapping("/careers/{id}")
    public Career findCareerById(@PathVariable int id){
        return careerService.findCareerById(id);
    }

    @PostMapping("/careers")
    public Career createCareer(@RequestBody Career career){
        return careerService.createCareer(career);
    }

    @PutMapping("/careers")
    public Career updateCareer(@RequestBody Career career){
        return careerService.updateCareer(career);
    }

    @DeleteMapping("/careers")
    public String deleteCareer(@PathVariable int id){
        careerService.deleteCareer(id);

        return "The career "+ id + " was deleted";
    }
}
