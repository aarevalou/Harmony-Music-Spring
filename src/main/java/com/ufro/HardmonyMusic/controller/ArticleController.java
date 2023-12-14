package com.ufro.HardmonyMusic.controller;

import com.ufro.HardmonyMusic.models.Article;
import com.ufro.HardmonyMusic.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
@CrossOrigin(origins = "*")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable int id) {
        return articleService.getArticleById(id);
    }

}
