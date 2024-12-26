package com.example.usersecurity;

import com.example.usersecurity.model.User;
import com.example.usersecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersecurityApplication implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(UsersecurityApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setUsername("testuser");
    user.setEmail("testuser@example.com");
    user.setPassword("password123");

    userRepository.save(user);
    System.out.println("User created successfully!");
  }
}
