package com.example.scoreboard;

public class TotalItem {

    //멤버변수 선언
    int totalId;
    String totalName;
    String totalScore;

    //생성자
    public TotalItem(int totalId, String totalName, String totalScore) {
        this.totalId = totalId;
        this.totalName = totalName;
        this.totalScore = totalScore;
    }

    //Getter & Setter

    public int getTotalId() {
        return totalId;
    }

    public void setTotalId(int totalId) {
        this.totalId = totalId;
    }

    public String getTotalName() {
        return totalName;
    }

    public void setTotalName(String totalName) {
        this.totalName = totalName;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }
}
