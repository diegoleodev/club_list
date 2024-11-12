package com.diegodev.clublist.dtos;

import com.diegodev.clublist.entities.ClubList;

public class ClubListDTO {

    private Long id;
    private String name;

    public ClubListDTO() {
    }

    public ClubListDTO(ClubList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
