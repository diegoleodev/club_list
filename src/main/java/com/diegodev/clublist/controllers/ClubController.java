package com.diegodev.clublist.controllers;

import com.diegodev.clublist.dtos.ClubDTO;
import com.diegodev.clublist.dtos.ClubMinDto;
import com.diegodev.clublist.entities.Club;
import com.diegodev.clublist.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping
    public List<ClubMinDto> findAll(){
        List<ClubMinDto> result = clubService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ClubDTO findById(@PathVariable Long id){
        ClubDTO result = clubService.findById(id);
        return result;
    }

}
