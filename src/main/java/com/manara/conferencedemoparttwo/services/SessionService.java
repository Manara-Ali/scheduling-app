package com.manara.conferencedemoparttwo.services;

import com.manara.conferencedemoparttwo.models.Session;
import com.manara.conferencedemoparttwo.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    // Inject the Session Repository
    @Autowired
    private SessionRepository sessionRepository;

    // Provide a method create new sessions
    public Session create(Session session) {
        return sessionRepository.saveAndFlush(session);
    }

    // Provide a method to read all the sessions
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    // Provide a method to retrieve a single session
    public Session getSession(Long id) {
        return sessionRepository.findById(id).get();
    }

    // Provide a method to update sessions
    public Session update(Session session, Long id) {
        // Find the session to be updated
        Session existingSession = getSession(id);

        // Update the existing session with the passed in session
        BeanUtils.copyProperties(session, existingSession, "session_id");
        return sessionRepository.saveAndFlush(existingSession);
    }

    // Provide a method to delete a session
    public void delete(Long id) {
        sessionRepository.deleteById(id);
    }
}
