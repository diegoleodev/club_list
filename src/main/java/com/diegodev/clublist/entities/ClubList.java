package com.diegodev.clublist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_club_list")
public class ClubList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public ClubList() {
    }

    public ClubList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubList clubList = (ClubList) o;
        return Objects.equals(id, clubList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
