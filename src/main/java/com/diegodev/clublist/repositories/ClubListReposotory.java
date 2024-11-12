package com.diegodev.clublist.repositories;

import com.diegodev.clublist.entities.ClubList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubListReposotory extends JpaRepository<ClubList, Long> {
}
