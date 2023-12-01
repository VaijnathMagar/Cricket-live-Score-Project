package com.crick.apis.entites;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name="crick_matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeadling;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String liveText;

    private String matchLink;

    private String textComplete;
@Enumerated
    private MatchStaus status;

    private Date date = new Date();

    public Match(int matchId, String teamHeadling, String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlTeam, String liveText, String matchLink, String textComplete, MatchStaus status, Date date) {
        this.matchId = matchId;
        this.teamHeadling = teamHeadling;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    public Match() {
    }




    // Set the match ststus according to text

    public void setMatchStuats(){
        if(textComplete.isBlank()){
            this.status=MatchStaus.LIVE;
        }else{
            this.status =MatchStaus.COMPLETED;
        }
    }
    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getTeamHeadling() {
        return teamHeadling;
    }

    public void setTeamHeadling(String teamHeadling) {
        this.teamHeadling = teamHeadling;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStaus getStatus() {
        return status;
    }

    public void setStatus(MatchStaus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
