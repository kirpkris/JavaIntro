package com.company.inheritance;

public class VideoMediaPost extends MediaPost implements Playable {

    String title;
    boolean autoSubtitles = false;
    boolean autoPlay = false;

    public VideoMediaPost(String author, String date, String message, MessageType type, String title) {
        super(author, date, message, type);
        this.title = title;
    }

    public void setAutoSubtitles(boolean autoSubtitles) {
        this.autoSubtitles = autoSubtitles;
        if (autoSubtitles) {
            System.out.println("Auto-subtitles are on");
        } else {
            System.out.println("Auto-subtitles are off");
        }
    }

    public void setAutoPlay(boolean autoPlay) {
        this.autoPlay = autoPlay;
        if(autoPlay) {
            System.out.println("Uploaded video will be played automatically");
        }
    }

    @Override
    public void play() {
        System.out.println("Playing \"" + title + "\" video");
    }
}
