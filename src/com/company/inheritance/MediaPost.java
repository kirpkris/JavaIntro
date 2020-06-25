package com.company.inheritance;

public class MediaPost extends Post {

    int MAX_MEDIA_POST_SIZE_MB = 10;

    public MediaPost(String author, String date, String message, MessageType type) {
        super(author, date, message, type);
    }

    @Override
    public void getMaxPostSize() {
        System.out.println("Maximum size for uploaded media is " + MAX_MEDIA_POST_SIZE_MB + " Mb.");
    }
}
