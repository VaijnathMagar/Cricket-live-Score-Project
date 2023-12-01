package com.crick.apis.repo;

import com.crick.apis.entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository <Match, Integer>{

    Optional<Match> findByTeamHeadling(String teamHeadling);


}
