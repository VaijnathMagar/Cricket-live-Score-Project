package com.crick.apis.Service;

import com.crick.apis.entites.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get cwc2023

    List<List<String>> getPointTable();

}
