package com.diegodev.clublist.dtos;

import com.diegodev.clublist.entities.Club;
import com.diegodev.clublist.projections.ClubMinProjection;

public class ClubMinDto {

    private Long id;
    private String title;
    private Integer yearFoundation;
    private String imgUrl;
    private String shortDescription;


    public ClubMinDto() {
    }

    public ClubMinDto(Club entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.yearFoundation = entity.getYearFoundation();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public ClubMinDto(ClubMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.yearFoundation = projection.getYearFoundation();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYearFoundation() {
        return yearFoundation;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
