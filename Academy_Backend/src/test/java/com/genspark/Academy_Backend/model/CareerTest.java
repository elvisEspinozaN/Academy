package com.genspark.Academy_Backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CareerTest {

    Career career;

    @BeforeEach
    void setUp(){
        career = new Career();
        career.setName("Java");
    }
    @Test
    void getCareerId() {
    }

    @Test
    void getName() {
        assertEquals("Java", career.getName());
    }
}