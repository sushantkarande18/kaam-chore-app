package com.sukar.appl.service;

import com.sukar.appl.entity.UserEntity;
import com.sukar.appl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> listAllUsers() {
        List<UserEntity> userList = new ArrayList<>();
        userRepository.findAll().forEach(t -> userList.add(t));
        return userList;
    }

    public UserEntity getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void addNewUser(UserEntity task) {
        userRepository.save(task);
    }

    public void updateUser(UserEntity task) {
        userRepository.findById(task.getId()).orElseThrow();
        userRepository.save(task);
    }

    public void deleteUser(Integer userId) {
        UserEntity userEntity = userRepository.findById(userId).orElseThrow();
        userRepository.delete(userEntity);
    }
}
