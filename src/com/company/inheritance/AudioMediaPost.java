package com.company.inheritance;

public class AudioMediaPost extends MediaPost implements Playable {

    double lengthInMin;
    String audioAuthor;
    String audioName;


    public AudioMediaPost(String author, String date, String message, MessageType type, String audioAuthor, String audioName) {
        super(author, date, message, type);
        this.audioAuthor = audioAuthor;
        this.audioName = audioName;
    }

    public double getAudioLength() {
        return lengthInMin;
    }

    public void cutAudioLength(double newLength) {
        double currentAudioLength = this.getAudioLength();
        if (newLength != 0.0 && newLength >= currentAudioLength) {
            lengthInMin = newLength;
            System.out.println("The audio is cut to " + newLength + " mins");
        } else {
            System.err.println("Specified time range is invalid.");
        }
    }

    @Override
    public void play() {
        System.out.println("Playing \"" + audioName + "\" by \"" + audioAuthor + "\"");
    }
}
