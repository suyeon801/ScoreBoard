package com.example.scoreboard;

public class UserItem {

    //멤버변수 선언
    int userId;
    String userName;
    int userBirth;
    String userGender;

    public UserItem(int userId, String userName, int userBirth, String userGender) {
        this.userId = userId;
        this.userName = userName;
        this.userBirth = userBirth;
        this.userGender = userGender;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(int userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
}
