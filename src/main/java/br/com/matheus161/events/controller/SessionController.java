package br.com.matheus161.events.controller;

import br.com.matheus161.events.model.Session;
import br.com.matheus161.events.service.ISessionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController {
    private ISessionService service;

    public SessionController(ISessionService service) {
        this.service = service;
    }

    @PostMapping("/sessions")
    public ResponseEntity<Session> addSession(@RequestBody Session session) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addSession(session));
    }

    @GetMapping("/sessions")
    public ResponseEntity<List<Session>> getAllSessions() {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllSessions());
    }

    @GetMapping("/sessions/{id}")
    public ResponseEntity<Session> getSessionById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.getSessionById(id));
    }
}
