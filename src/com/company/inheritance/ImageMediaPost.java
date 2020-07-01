package com.company.inheritance;

public class ImageMediaPost extends MediaPost implements Printable {

    private boolean imageCompression;
    private int widthInPx;
    private int heightInPx;

    public ImageMediaPost(String author, String date, String message, MessageType type, int widthInPx, int heightInPx) {
        super(author, date, message, type);
        this.widthInPx = widthInPx;
        this.heightInPx = heightInPx;
    }

    public void resizeImage(int newWidth, int newHeight, boolean compressionOption) {
        if (newWidth == 0 || newHeight == 0) {
            System.err.println("Image width/height cannot be 0");
        } else if (newWidth < 0 || newHeight < 0) {
            System.err.println("Invalid image size");
        } else {
            widthInPx = newWidth;
            heightInPx = newHeight;
            imageCompression = compressionOption;
            System.out.println("The image is resized to: " + newWidth + "px x " + newHeight + " px.");
        }
    }

    @Override
    public void print() {
        System.out.println("Printing an image from " + type.name().toLowerCase());
    }
}
