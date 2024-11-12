package com.diegodev.clublist.controllers;

import com.diegodev.clublist.dtos.ClubDTO;
import com.diegodev.clublist.dtos.ClubListDTO;
import com.diegodev.clublist.dtos.ClubMinDto;
import com.diegodev.clublist.services.ClubListService;
import com.diegodev.clublist.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class ClubListController {

    @Autowired
    private ClubListService clubListService;

    @GetMapping
    public List<ClubListDTO> findAll(){
        List<ClubListDTO> result = clubListService.findAll();
        return result;
    }


}
