package com.mamydinyah.DemoConnectionPostgres.service;

import com.mamydinyah.DemoConnectionPostgres.dto.UserDto;
import com.mamydinyah.DemoConnectionPostgres.entity.User;
import com.mamydinyah.DemoConnectionPostgres.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setGender(userDto.getGender());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setAddress(userDto.getAddress());
        userRepository.save(user);
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }

    public User userById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void updateUser(UserDto userDto) {
        userRepository.findById(userDto.getId()).ifPresent(existingUser -> {
            existingUser.setName(userDto.getName());
            existingUser.setGender(userDto.getGender());
            existingUser.setEmail(userDto.getEmail());
            existingUser.setPhone(userDto.getPhone());
            existingUser.setAddress(userDto.getAddress());
            userRepository.save(existingUser);
        });
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public List<User> findByName(String name) {
        return userRepository.findByNameContainingIgnoreCase(name);
    }
}