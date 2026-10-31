package com.project.springCrud.resources;

import com.project.springCrud.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Phietro", "phietro@gmail.com", "99999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
