package com.ufro.HardmonyMusic.repository;

import com.ufro.HardmonyMusic.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    List<Event> findAll();
    Event findById(int id);
    void deleteById(int id);
}
