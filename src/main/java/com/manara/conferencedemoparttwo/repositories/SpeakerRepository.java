package com.manara.conferencedemoparttwo.repositories;

import com.manara.conferencedemoparttwo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
