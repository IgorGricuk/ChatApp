package com.example.chatapp;

import java.util.Date;

public class Message {
    public String userName;
    public String textMessage;
    private long messgaeTime;

    public Message (){}
    public Message (String userName, String textMessage) {
        this.userName = userName;
        this.textMessage = textMessage;

        this.messgaeTime = new Date().getTime();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public long getMessgaeTime() {
        return messgaeTime;
    }

    public void setMessgaeTime(long messgaeTime) {
        this.messgaeTime = messgaeTime;
    }
}
