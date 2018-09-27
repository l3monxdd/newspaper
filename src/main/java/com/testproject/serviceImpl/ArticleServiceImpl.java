package com.testproject.serviceImpl;

import com.testproject.dao.ArticleDao;
import com.testproject.entities.Article;
import com.testproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public void delete(int id) {
        articleDao.deleteById(id);
    }

    @Override
    public Article findById(int id) {
        return articleDao.findById(id).get();
    }


    @Override
    public void save(Article article) {
        articleDao.save(article);
    }

    @Override
    public void update(Article article) {
        articleDao.save(article);
    }

    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }
}
