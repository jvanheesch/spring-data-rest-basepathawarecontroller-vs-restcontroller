package com.github.jvanheesch;

import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@BasePathAwareController
public class MyBasePathAwareController {
    @GetMapping(path = "/sdr", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sdr() {
        return ResponseEntity.of(Optional.of("sdr"));
    }
}
