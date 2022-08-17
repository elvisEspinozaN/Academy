package com.genspark.Academy_Backend.service;
import com.genspark.Academy_Backend.dao.LoginDao;
import com.genspark.Academy_Backend.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginDao loginDao;

    @Override
    public List<Login> findAllLogin() {
        return loginDao.findAll();
    }

    @Override
    public Login findLoginById(int id) {
        Login l;
        Optional<Login> opt = loginDao.findById(id);

        if (opt.isPresent()){
            l = opt.get();
        }else{
            throw new RuntimeException("The login "+ id + " wasn't found");
        }

        return l;
    }

    @Override
    public Login createLogin(Login login) {
        return loginDao.save(login);
    }

    @Override
    public Login updateLogin(Login login) {
        return loginDao.save(login);
    }

    @Override
    public String deleteLogin(int id) {
        loginDao.deleteById(id);

        return "The login "+ id + " was deleted";
    }

}