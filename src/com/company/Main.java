package com.company;

import com.company.collections.User;
import com.company.exceptions.Dishwasher;
import com.company.inheritance.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1. inheritance/ interfaces

        TextPost comment = new TextPost("Kristina Kirpicheva", "20/06/20", "This is my text post", MessageType.COMMENT);
        ImageMediaPost image = new ImageMediaPost("Kristina Kirpicheva", "20/06/20", "This is my uploaded image", MessageType.POST, 100, 200);
        AudioMediaPost audio = new AudioMediaPost("Kristina Kirpicheva", "20/06/20", "This is my uploaded audio", MessageType.POST, "Popular Singer", "Popular song");
        VideoMediaPost video = new VideoMediaPost("Kristina Kirpicheva", "20/06/20", "This is a cool video", MessageType.REPOST, "Cool vid");

/*        // show comment info
        comment.getPostInfo();

        // print the comment
        comment.print();

        // resizeImage
        image.resizeImage(10, 50, false);

        // print image
        image.print();

        // check audio length
        audio.cutAudioLength(5.0);

        // play audio
        audio.play();

        // switch subtitles on
        video.setAutoSubtitles(true);

        // set autoplay
        video.setAutoPlay(true);

        // play video
        video.play();*/

        //=======================================================================================


    }
}
