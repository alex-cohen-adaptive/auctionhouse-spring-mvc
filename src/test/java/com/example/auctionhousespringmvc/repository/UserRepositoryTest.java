package com.example.auctionhousespringmvc.repository;

import com.example.auctionhousespringmvc.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
  @Autowired
  private UserRepository userRepository;

  @Test
  public void addUser_shouldAdd() {
    User user = User.builder()
        .firstName()
        .build();
  }

}