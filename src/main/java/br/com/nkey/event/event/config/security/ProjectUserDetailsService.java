package br.com.nkey.event.event.config.security;

import br.com.nkey.event.event.model.User;
import br.com.nkey.event.event.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class ProjectUserDetailsService implements UserDetailsService {

    private UserService service;

    public ProjectUserDetailsService (UserService service) {
        this.service = service;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = service.loadUserByUsername(username);
        if (user != null) {
            return new LoggedUser(user, Collections.emptyList());
        }
        else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
