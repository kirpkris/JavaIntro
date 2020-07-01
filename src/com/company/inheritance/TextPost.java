package com.company.inheritance;

public class TextPost extends Post implements Printable {

    private static final int MAX_MEDIA_POST_LENGTH = 500;

    public TextPost(String author, String date, String message, MessageType type) {
        super(author, date, message, type);
    }

    @Override
    public void getMaxPostSize() {
        System.out.println("Maximum text length is " + MAX_MEDIA_POST_LENGTH + "characters.");
    }

    @Override
    public void print() {
        System.out.println("Printing the following " + type.toString().toLowerCase() + ":\n" + message);
    }

}
