package com.ufro.HardmonyMusic.services;

import com.ufro.HardmonyMusic.models.Artist;
import com.ufro.HardmonyMusic.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Artist getArtistById(int id) {
        return artistRepository.findById(id);
    }
}
