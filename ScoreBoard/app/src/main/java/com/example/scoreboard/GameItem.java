package com.example.scoreboard;

public class GameItem {

    //멤버변수 선언
    String name; //GameName

    public GameItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
