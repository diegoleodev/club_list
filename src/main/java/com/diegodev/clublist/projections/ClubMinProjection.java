package com.diegodev.clublist.projections;

public interface ClubMinProjection {

    Long getId();
    String getTitle();
    Integer getYearFoundation();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
