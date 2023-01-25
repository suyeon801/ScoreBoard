package com.example.scoreboard;

public class UserItem {

    //멤버변수 선언
    String userId;
    String userName;
    String userBirth;
    String userGender;

    public UserItem(String userId, String userName, String userBirth, String userGender) {
        this.userId = userId;
        this.userName = userName;
        this.userBirth = userBirth;
        this.userGender = userGender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
}
