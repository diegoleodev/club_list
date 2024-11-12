package com.diegodev.clublist.services;

import com.diegodev.clublist.dtos.ClubDTO;
import com.diegodev.clublist.dtos.ClubMinDto;
import com.diegodev.clublist.entities.Club;
import com.diegodev.clublist.repositories.ClubRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    ClubRespository clubRespository;

    @Transactional(readOnly = true)
    public List<ClubMinDto> findAll(){
        List<Club> result = clubRespository.findAll();
        List<ClubMinDto> dto = result.stream().map(x -> new ClubMinDto(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public ClubDTO findById(Long id){
        Club result = clubRespository.findById(id).get();
        ClubDTO dto = new ClubDTO(result);
        return dto;
    }
}
