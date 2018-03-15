package com.kgfsl.eventapp;

import java.util.List;

import com.kgfsl.eventapp.Event;

public interface EventService {

    public List<Event> getAll();

    public List<Event> get3Top();

    public Event save(Event event);

    public Event find(long id);

    public void delete(Long id);

}