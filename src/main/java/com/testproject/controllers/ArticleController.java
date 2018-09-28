package com.testproject.controllers;

import com.testproject.entities.Article;
import com.testproject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping()
    public Article addArticle (@RequestBody Article article){
        articleService.save(article);
        return article;
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable int id){
        articleService.delete(id);
    }

    @GetMapping("/{id}")
    public Article findArticleById(@PathVariable int id){
        return articleService.findById(id);
    }

    @GetMapping("/all")
    public List<Article> findAllArticles(){
        return articleService.findAll();
    }





}
