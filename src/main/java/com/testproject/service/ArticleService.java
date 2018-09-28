package com.testproject.service;

import com.testproject.entities.Article;

import java.util.List;

public interface ArticleService {

    void delete(int id);

    Article findById(int id);

    void save(Article article);

    void update(Article article);

    List<Article> findAll();
}
