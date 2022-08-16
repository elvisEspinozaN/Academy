package com.genspark.Academy_Backend.controller;
import com.genspark.Academy_Backend.model.Login;
import com.genspark.Academy_Backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/logins")
    public List<Login> findAllLogin(){
        return loginService.findAllLogin();
    }

    @GetMapping("/logins/{id}")
    public Login findLoginById(@PathVariable int id){
        return loginService.findLoginById(id);
    }

    @PostMapping("/logins")
    public Login createLogin(@RequestBody Login login){
        return loginService.createLogin(login);
    }

    @PutMapping("/logins")
    public Login updateLogin(@RequestBody Login login){
        return loginService.updateLogin(login);
    }

    @DeleteMapping("/logins/{id}")
    public String deleteLogin(@PathVariable int id){
        return loginService.deleteLogin(id);
    }
}
