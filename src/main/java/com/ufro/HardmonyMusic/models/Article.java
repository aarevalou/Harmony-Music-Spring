package com.ufro.HardmonyMusic.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "tittle", nullable = false)
    private String tittle;

    @Column(name = "`desc`", nullable = false)
    private String desc;

    @Column(name = "date", nullable = false)
    private String date;
}
