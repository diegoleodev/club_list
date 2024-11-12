package com.diegodev.clublist.repositories;

import com.diegodev.clublist.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRespository extends JpaRepository<Club, Long> {
}
