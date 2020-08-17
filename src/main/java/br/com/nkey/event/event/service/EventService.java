package br.com.nkey.event.event.service;

import br.com.nkey.event.event.model.Event;
import br.com.nkey.event.event.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public List<Event> listEvents () {

        return repository.findAll();
    }

    public void addEvent (Event event) {
        repository.save(event);
    }

    public void deleteEvent (String id) {
        repository.deleteById(id);
    }
}
