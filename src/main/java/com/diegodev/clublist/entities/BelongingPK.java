package com.diegodev.clublist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;
    @ManyToOne
    @JoinColumn(name = "club_list_id")
    private ClubList clubList;

    public BelongingPK() {
    }

    public BelongingPK(Club club, ClubList clubList) {
        this.club = club;
        this.clubList = clubList;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public ClubList getClubList() {
        return clubList;
    }

    public void setClubList(ClubList clubList) {
        this.clubList = clubList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(club, that.club) && Objects.equals(clubList, that.clubList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(club, clubList);
    }
}
