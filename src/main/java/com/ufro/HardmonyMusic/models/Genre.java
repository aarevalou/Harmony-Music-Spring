package com.ufro.HardmonyMusic.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "`desc`", nullable = false)
    private String desc;
}
