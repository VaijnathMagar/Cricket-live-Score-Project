package com.crick.apis.controller;

import com.crick.apis.Service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class Match {

    private MatchService matchService;

    public Match(MatchService matchService) {
        this.matchService = matchService;
    }
    @GetMapping("/live")
    public ResponseEntity<List<com.crick.apis.entites.Match>> getLiveMatches(){

return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }


//get all matches

    @GetMapping
    public ResponseEntity<List<com.crick.apis.entites.Match>> getAllMatches(){

        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }


//get point tables
    @GetMapping("/pointtable")
    public ResponseEntity<?>getPointTables(){


        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }



}
