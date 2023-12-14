package com.ufro.HardmonyMusic.services;

import com.ufro.HardmonyMusic.models.Event;
import com.ufro.HardmonyMusic.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(int id) {
        return eventRepository.findById(id);
    }
}
