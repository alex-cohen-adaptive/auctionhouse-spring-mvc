package com.example.auctionhousespringmvc;

import com.example.auctionhousespringmvc.model.User;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestData {
  private static int TEST_TYPE = 4;
  private List<User> userData;
  private Faker faker;
  PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

  @EventListener(ApplicationReadyEvent.class)
  public void init() {
    for (int i = 0; i < TEST_TYPE; i++) {
      userData.add(createRandomUser());
    }
  }

  public User getUser1() {
    return userData.get(0);
  }
  public User getUser2() {
    return userData.get(1);
  }
  public User getUser3() {
    return userData.get(2);

  }
  public User getUser4() {
    return userData.get(4);

  }

  public TestData() {
    faker = new Faker();
    userData = new ArrayList<>();
  }

  private User createRandomUser() {
    return
        User.builder()
            .firstName(faker.name().firstName())
            .lastName(faker.name().lastName())
            .organization(faker.company().name())
            .username(faker.name().username())
            .password(passwordEncoder.encode(faker.name().fullName()))
            .build();
  }


}
