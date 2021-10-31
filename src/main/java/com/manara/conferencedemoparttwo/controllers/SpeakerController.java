package com.manara.conferencedemoparttwo.controllers;

import com.manara.conferencedemoparttwo.models.Speaker;
import com.manara.conferencedemoparttwo.services.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakerController {

    // Inject the speaker service class
    @Autowired
    private SpeakerService speakerService;

    // Create a method to create a new speaker
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Speaker create(@RequestBody Speaker speaker) {
        return speakerService.create(speaker);
    }

    // Create a method to retrieve all speakers
    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Speaker> getAllSpeakers() {
        return speakerService.getAllSpeaker();
    }

    @RequestMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Speaker getSpeaker(@PathVariable Long id) {
        return speakerService.getSpeaker(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Speaker update(@RequestBody Speaker speaker, @PathVariable Long id) {
        return speakerService.update(speaker, id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        speakerService.delete(id);
    }
}
