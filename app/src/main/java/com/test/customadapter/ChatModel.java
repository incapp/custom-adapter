package com.test.customadapter;

public class ChatModel {

    public ChatModel(int image, String username, String message) {
        this.image = image;
        this.username = username;
        this.message = message;
    }

    private int image;
    private String username;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
