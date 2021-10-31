package com.manara.conferencedemoparttwo.controllers;

import com.manara.conferencedemoparttwo.models.Session;
import com.manara.conferencedemoparttwo.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

    // Inject the service class
    @Autowired
    private SessionService  sessionService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody Session session) {
        return sessionService.create(session);
    }

    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @RequestMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Session getSession(@PathVariable Long id) {
        return sessionService.getSession(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Session update(@RequestBody Session session, @PathVariable Long id) {
        return sessionService.update(session, id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        sessionService.delete(id);
    }
}
