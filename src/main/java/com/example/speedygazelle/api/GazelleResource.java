package com.example.speedygazelle.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GazelleResource {

    @GetMapping("gazelle/{name}")
    public ResponseEntity<String> getGazelle(@PathVariable("name") String name) {

        return ResponseEntity.ok().body("Hello " + name);

    }

}
