package com.manara.conferencedemoparttwo.controllers;

import com.manara.conferencedemoparttwo.models.SessionSpeaker;
import com.manara.conferencedemoparttwo.services.SessionSpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/session-speakers")
public class SessionSpeakerController {
    @Autowired
    private SessionSpeakerService sessionSpeakerService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public SessionSpeaker create(@RequestBody SessionSpeaker sessionSpeaker) {
        return sessionSpeakerService.create(sessionSpeaker);
    }
}
