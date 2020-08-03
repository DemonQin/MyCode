package com.shsxt.vo;

public class User {
    private int id;
    private String userName;
    private String userPwd;

    public int getId() {
        return id;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }

    public User() {
    }

    public User(int id, String userName, String userPwd) {
        this.id = id;
        this.userName = userName;
        this.userPwd = userPwd;
    }
}
