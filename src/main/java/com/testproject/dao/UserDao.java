package com.testproject.dao;

import com.testproject.entities.Color;
import com.testproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.age >:parameter")
    List<User> findByAge(@Param("parameter") int parameter);

    @Query("select u from Article a left join User u on u.id = a.user.id where a.color=:colorParam")
    List<User> findUserByColorInArticle(@Param("colorParam")Color color);

}
