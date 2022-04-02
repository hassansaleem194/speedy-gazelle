package com.example.speedygazelle.api;

import com.example.speedygazelle.User;
import com.example.speedygazelle.repository.GazelleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class GazelleResource {

    @Autowired
    private GazelleRepo gazelleRepo;

    @GetMapping("gazelle/{name}")
    public ResponseEntity<String> getGazelle(@PathVariable("name") String name) {

        return ResponseEntity.ok().body("Hello " + name);

    }

    @PostMapping("gazelle/addUser/{name}")
    public ResponseEntity<String> addUser(@PathVariable("name") String name) {

        User user = new User(name, UUID.randomUUID().toString());
        gazelleRepo.save(user);
        return ResponseEntity.ok().body("Added new user: " + name);

    }

    @GetMapping("gazelle/userList")
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.ok().body(gazelleRepo.findAll());

    }

}
