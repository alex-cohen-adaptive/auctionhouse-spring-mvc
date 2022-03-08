package com.example.auctionhousespringmvc;

import com.example.auctionhousespringmvc.model.User;
import com.github.javafaker.Faker;

import java.util.List;

public class TestData {
  private static int TEST_TYPE = 4;
  private List<User> userData;
  private Faker faker = new Faker();


  private User createRandomUser() {
    return User.builder()
        .firstName()
        .lastName()
        .organization()
        .password()
        .
        .build();
  }
}
