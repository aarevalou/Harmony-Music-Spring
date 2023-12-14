package com.ufro.HardmonyMusic.services;

import com.ufro.HardmonyMusic.models.Article;
import com.ufro.HardmonyMusic.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(int id) {
        return articleRepository.findById(id);
    }
}
