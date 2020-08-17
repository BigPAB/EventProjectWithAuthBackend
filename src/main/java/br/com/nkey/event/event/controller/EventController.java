package br.com.nkey.event.event.controller;

import br.com.nkey.event.event.model.Event;
import br.com.nkey.event.event.service.EventService;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/event")
public class EventController {

    EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping("/")
    public @ResponseBody List<Event> listEvents () {

      return (service.listEvents());
    }

    @PostMapping("/")
    public @ResponseBody String addEvent(@RequestBody Event event) {
        service.addEvent(event);
        return event.getId();
    }

    @PutMapping("/")
    public @ResponseBody String updateEvent(@RequestBody Event event) {
        service.addEvent(event);
        return event.getId();
    }

    @DeleteMapping("/{id}")
    public @ResponseBody String deleteEvent (@PathVariable String id) {
        service.deleteEvent(id);
        return id;
    }
}
