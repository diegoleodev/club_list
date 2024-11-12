package com.diegodev.clublist.repositories;

import com.diegodev.clublist.entities.Club;
import com.diegodev.clublist.projections.ClubMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClubRespository extends JpaRepository<Club, Long> {

    @Query(nativeQuery = true, value = """
           SELECT tb_club.id, tb_club.title, tb_club.club_year AS `year`,  tb_club.img_url AS `imgUrl`, tb_club.short_description AS `shortDescription`,
           tb_belonging.position
           FROM tb_club
           INNER JOIN tb_belonging ON tb_club.id = tb_belonging.club_id
           WHERE tb_belonging.club_list_id = :listId
           ORDER BY tb_belonging.position
            """)
    List<ClubMinProjection> searchByList(Long listId);
}
