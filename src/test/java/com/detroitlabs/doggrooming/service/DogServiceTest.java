package com.detroitlabs.doggrooming.service;

import com.detroitlabs.doggrooming.model.Dog;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogServiceTest {

    private static Dog[] result;

    @BeforeAll
    public static void setUp() {
        result = DogService.fetchDog();
    }

    @Test
    void fetchDog_should_return_URL() {
        System.out.println(result[0].getUrl());
        assertNotNull(result[0].getUrl());
    }

    @Test
    void fetchDog_should_return_name() {
        System.out.println(result[0].getBreeds()[0].getName());
        assertNotNull(result[0].getBreeds()[0].getName());
    }
}