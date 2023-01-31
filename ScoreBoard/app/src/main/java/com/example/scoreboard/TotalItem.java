package com.example.scoreboard;

public class TotalItem {

    //멤버변수 선언
    int totalId; //Id 
    String totalName; //이름(u_name)
    int totalScore; //승리횟수(v_count)

    //생성자
    public TotalItem(int totalId, String totalName, int totalScore) {
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

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
