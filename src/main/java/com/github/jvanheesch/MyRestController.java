package com.github.jvanheesch;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MyRestController {
    @GetMapping(path = "/api/mvc", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> mvc() {
        return ResponseEntity.of(Optional.of("mvc"));
    }
}
