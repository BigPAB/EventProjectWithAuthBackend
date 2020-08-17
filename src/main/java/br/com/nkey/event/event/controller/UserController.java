package br.com.nkey.event.event.controller;

import br.com.nkey.event.event.model.Event;
import br.com.nkey.event.event.model.User;
import br.com.nkey.event.event.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/")
public class UserController {

    private UserService service;

    public UserController (UserService service) {
        this.service = service;
    }

    @PostMapping(value = "register")
    public @ResponseBody String registerUser (@RequestBody User user) {
        service.registerUser(user);
        return user.getId();
    }

    @GetMapping("users")
    public @ResponseBody List<User> listUsers () {

        return (service.listUsers());
    }
}
