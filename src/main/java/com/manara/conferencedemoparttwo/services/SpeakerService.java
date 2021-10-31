package com.manara.conferencedemoparttwo.services;

import com.manara.conferencedemoparttwo.models.Speaker;
import com.manara.conferencedemoparttwo.repositories.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {

    // Inject the speaker repository
    @Autowired
    private SpeakerRepository speakerRepository;

    // Create a method
    public Speaker create(Speaker speaker) {
        return speakerRepository.saveAndFlush(speaker);
    }

    // Provide a method to retrieve a list of all speakers
    public List<Speaker> getAllSpeaker() {
        return speakerRepository.findAll();
    }

    // Provide a method to retrieve a single speaker
    public Speaker getSpeaker(Long id) {
        return speakerRepository.findById(id).get();
    }

    // Provide a method to update a speaker information
    public Speaker update(Speaker speaker, Long id) {
        // Find the speaker to be updated
        Speaker existingSpeaker = getSpeaker(id);

        // Update the speaker information
        BeanUtils.copyProperties(speaker, existingSpeaker, "speaker_id");

        return speakerRepository.saveAndFlush(existingSpeaker);
    }

    // Provide a method to delete speakers
    public void delete(Long id) {
        speakerRepository.deleteById(id);
    }
}
