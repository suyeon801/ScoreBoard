package com.example.scoreboard;

public class ScoreItem {
    //멤버변수 선언
    String date; //경기날짜
    String userA; //A player
    int scoreA; //A player score
    String userB; //B player
    int scoreB; //B player score

    public ScoreItem(String date, String userA, int scoreA, String userB, int scoreB) {
        this.date = date;
        this.userA = userA;
        this.scoreA = scoreA;
        this.userB = userB;
        this.scoreB = scoreB;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserA() {
        return userA;
    }

    public void setUserA(String userA) {
        this.userA = userA;
    }

    public int getScoreA() {
        return scoreA;
    }

    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public String getUserB() {
        return userB;
    }

    public void setUserB(String userB) {
        this.userB = userB;
    }

    public int getScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }
}
