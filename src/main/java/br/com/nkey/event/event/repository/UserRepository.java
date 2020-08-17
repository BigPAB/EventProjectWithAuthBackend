package br.com.nkey.event.event.repository;

import br.com.nkey.event.event.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
