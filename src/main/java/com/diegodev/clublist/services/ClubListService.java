package com.diegodev.clublist.services;

import com.diegodev.clublist.dtos.ClubListDTO;
import com.diegodev.clublist.entities.Club;
import com.diegodev.clublist.entities.ClubList;
import com.diegodev.clublist.repositories.ClubListReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubListService {

    @Autowired
    private ClubListReposotory clubListReposotory;

    public List<ClubListDTO> findAll(){
        List<ClubList> result = clubListReposotory.findAll();
        return result.stream().map(x -> new ClubListDTO(x)).toList();
    }

}
