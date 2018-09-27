package com.testproject.serviceImpl;

import com.testproject.dao.UserDao;
import com.testproject.entities.Color;
import com.testproject.entities.User;
import com.testproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> findByAge(int age) {
        return userDao.findByAge(age);
    }

    @Override
    public List<User> findUserByColorInArticle(Color color) {
        return userDao.findUserByColorInArticle(color);
    }
}
