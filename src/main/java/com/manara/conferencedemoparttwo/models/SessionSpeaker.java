package com.manara.conferencedemoparttwo.models;

import javax.persistence.*;

@Entity
@Table(name="session_speakers")
public class SessionSpeaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long session_id;
    private Long speaker_id;

    public SessionSpeaker() {}

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }
}
