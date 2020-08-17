package br.com.nkey.event.event.repository;

import br.com.nkey.event.event.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
