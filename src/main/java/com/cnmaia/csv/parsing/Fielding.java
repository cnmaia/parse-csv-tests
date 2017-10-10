package com.cnmaia.csv.parsing;

import org.springframework.data.annotation.Id;

public class Fielding {
    @Id
    private String id;

    // TODO Change to the correct types - test purpose
    private String playerId;
    private String year;
    private String stint;
    private String team;
    private String league;
    private String position;
    private String games;
    private String gamesStarted;
    private String innOuts;
    private String putOuts;
    private String assists;
    private String errors;
    private String doublePlays;
    private String passedBalls;
    private String wildPitches;
    private String opponentStolenBases;
    private String opponentCaughtStealing;
    private String zoneRating;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStint() {
        return stint;
    }

    public void setStint(String stint) {
        this.stint = stint;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(String gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public String getInnOuts() {
        return innOuts;
    }

    public void setInnOuts(String innOuts) {
        this.innOuts = innOuts;
    }

    public String getPutOuts() {
        return putOuts;
    }

    public void setPutOuts(String putOuts) {
        this.putOuts = putOuts;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getDoublePlays() {
        return doublePlays;
    }

    public void setDoublePlays(String doublePlays) {
        this.doublePlays = doublePlays;
    }

    public String getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(String passedBalls) {
        this.passedBalls = passedBalls;
    }

    public String getWildPitches() {
        return wildPitches;
    }

    public void setWildPitches(String wildPitches) {
        this.wildPitches = wildPitches;
    }

    public String getOpponentStolenBases() {
        return opponentStolenBases;
    }

    public void setOpponentStolenBases(String opponentStolenBases) {
        this.opponentStolenBases = opponentStolenBases;
    }

    public String getOpponentCaughtStealing() {
        return opponentCaughtStealing;
    }

    public void setOpponentCaughtStealing(String opponentCaughtStealing) {
        this.opponentCaughtStealing = opponentCaughtStealing;
    }

    public String getZoneRating() {
        return zoneRating;
    }

    public void setZoneRating(String zoneRating) {
        this.zoneRating = zoneRating;
    }
}
