package com.ufro.HardmonyMusic.repository;

import com.ufro.HardmonyMusic.models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer> {

    List<Genre> findAll();
    Genre findById(int id);

    void deleteById(int id);
}
