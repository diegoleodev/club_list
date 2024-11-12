package com.diegodev.clublist.services;

import com.diegodev.clublist.dtos.ClubMinDto;
import com.diegodev.clublist.entities.Club;
import com.diegodev.clublist.repositories.ClubRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    ClubRespository clubRespository;

    public List<ClubMinDto> findAll(){
        List<Club> result = clubRespository.findAll();
        List<ClubMinDto> dto = result.stream().map(x -> new ClubMinDto(x)).toList();
        return dto;
    }
}
