package br.com.matheus161.events.controller;

import br.com.matheus161.events.model.Conference;
import br.com.matheus161.events.service.IConferenceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConferenceController {
    private IConferenceService service;

    public ConferenceController(IConferenceService service) {
        this.service = service;
    }

    @PostMapping("/conferences")
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addConference(conference));
    }

    @GetMapping("/conferences")
    public ResponseEntity<List<Conference>> getAllConferences() {
        return ResponseEntity.ok(service.getAllConferences());
    }

    @GetMapping("/conference/{id}")
    public ResponseEntity<Conference> getById(@PathVariable() Integer id) {
        return ResponseEntity.ok(service.getConferenceById(id));
    }
}
