package com.testproject.service;

import com.testproject.entities.Color;
import com.testproject.entities.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void delete(int id);

    void update(User user);

    List<User>findAll();

    User findById(int id);

    List<User> findByAge(int age);

    List<User> findUserByColorInArticle(Color color);

}
