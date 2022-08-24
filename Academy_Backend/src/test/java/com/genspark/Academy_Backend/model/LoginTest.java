package com.genspark.Academy_Backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    Login login;

    @BeforeEach
    void setUp(){
        login = new Login("user", "password", true);
        System.out.println("I am in Before Each");
    }
    @Test
    void getUserName() {
        assertEquals("user", login.getUserName());
    }
    @Test
    void getPassword() {
        assertEquals("password", login.getPassword());
    }

    @Test
    @DisplayName("Testing access")
    void isAdmin() {
        assertEquals(true, login.isAdmin());
    }
}