package com.ufro.HardmonyMusic.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "place", nullable = false)
    private String place;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "hour", nullable = false)
    private String hour;

    @Column(name = "image", nullable = false)
    private String image;
}
