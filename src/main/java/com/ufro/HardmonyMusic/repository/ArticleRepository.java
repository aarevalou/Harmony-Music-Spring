package com.ufro.HardmonyMusic.repository;

import com.ufro.HardmonyMusic.models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

    List<Article> findAll();
    Article findById(int id);
    void deleteById(int id);
}
