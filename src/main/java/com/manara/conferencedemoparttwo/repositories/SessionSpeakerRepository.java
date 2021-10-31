package com.manara.conferencedemoparttwo.repositories;

import com.manara.conferencedemoparttwo.models.SessionSpeaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionSpeakerRepository extends JpaRepository<SessionSpeaker, Long> {
}
