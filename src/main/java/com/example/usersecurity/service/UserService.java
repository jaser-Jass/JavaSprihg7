package com.example.usersecurity.service;

import com.example.usersecurity.model.User;
import com.example.usersecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    public Optional<User> getUser(long id) {

        return userRepository.findById(id);
    }
    public User updateUser(Long userId, User userDetails) {

        return userRepository.save(userDetails);
    }
    public void deleteUser(Long userId) {

        userRepository.deleteById(userId);
    }
}
