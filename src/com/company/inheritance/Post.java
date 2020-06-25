package com.company.inheritance;

public abstract class Post {

    String author;
    String date;
    String message;
    MessageType type;

    public Post(String author, String date, String message, MessageType type) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.type = type;
    }

    public void getPostInfo() {
        System.out.println("Author: " + author);
        System.out.println("Date: " + date);
        System.out.println("Message: " + message);
        System.out.println("Type: " + type);
    }

    public abstract void getMaxPostSize();

}
