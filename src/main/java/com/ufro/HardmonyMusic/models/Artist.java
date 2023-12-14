package com.ufro.HardmonyMusic.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "genre", nullable = false)
    private String genre;

}
