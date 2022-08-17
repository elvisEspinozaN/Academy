package com.genspark.Academy_Backend.service;
import com.genspark.Academy_Backend.model.Login;
import java.util.List;

public interface LoginService {

    List<Login> findAllLogin();

    Login findLoginById(int id);

    Login createLogin(Login login);

    Login updateLogin(Login login);

    String deleteLogin(int id);

}
