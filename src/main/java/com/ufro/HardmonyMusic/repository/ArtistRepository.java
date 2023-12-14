package com.ufro.HardmonyMusic.repository;

import com.ufro.HardmonyMusic.models.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer> {

    List<Artist> findAll();
    Artist findById(int id);
    void deleteById(int id);
}
