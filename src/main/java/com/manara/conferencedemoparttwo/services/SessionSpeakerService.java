package com.manara.conferencedemoparttwo.services;

import com.manara.conferencedemoparttwo.models.SessionSpeaker;
import com.manara.conferencedemoparttwo.repositories.SessionSpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionSpeakerService {

    @Autowired
    private SessionSpeakerRepository sessionSpeakerRepository;

    public SessionSpeaker create(SessionSpeaker sessionSpeaker) {
        return sessionSpeakerRepository.saveAndFlush(sessionSpeaker);
    }
}
