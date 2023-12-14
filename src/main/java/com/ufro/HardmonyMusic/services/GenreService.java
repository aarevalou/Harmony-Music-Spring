package com.ufro.HardmonyMusic.services;

import com.ufro.HardmonyMusic.models.Genre;
import com.ufro.HardmonyMusic.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GenreService {

    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre getGenreById(int id) {
        return genreRepository.findById(id);
    }
}
