package com.first_full.baby.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Users {

    @Id
    private String email;
    private String displayName;
    private String gender;
    private Integer matchPlayed;
    private Integer maxScore;
    private Integer totalCoins;
    private Integer winGames;
    private String stage;
    private Integer score;
    @Column(name = "level")
    private Integer level;
    private List<Integer> foundEle;
    private Integer num;

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Integer> getFoundEle() {
        return foundEle;
    }

    public void setFoundEle(List<Integer> foundEle) {
        this.foundEle = foundEle;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Lob
    private byte[] photoUrl;

    public byte[] getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(byte[] photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getMatchPlayed() {
        return matchPlayed;
    }

    public void setMatchPlayed(Integer matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public Integer getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    public Integer getTotalCoins() {
        return totalCoins;
    }

    public void setTotalCoins(Integer totalCoins) {
        this.totalCoins = totalCoins;
    }

    public Integer getWinGames() {
        return winGames;
    }

    public void setWinGames(Integer winGames) {
        this.winGames = winGames;
    }
}



