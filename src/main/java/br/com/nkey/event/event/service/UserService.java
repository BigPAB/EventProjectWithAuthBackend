package br.com.nkey.event.event.service;

import br.com.nkey.event.event.model.Event;
import br.com.nkey.event.event.model.User;
import br.com.nkey.event.event.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    
    public User loadUserByUsername(String username) {
        User user = repository.findByUsername(username);
        return user;
    }

    public void registerUser (User user) {
        repository.save(user);
    }

    public List<User> listUsers () {

        return repository.findAll();
    }
}
