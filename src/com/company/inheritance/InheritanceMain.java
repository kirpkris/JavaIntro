package com.company.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {

        TextPost comment = new TextPost("Kristina Kirpicheva", "20/06/20", "This is my text post", MessageType.COMMENT);
        ImageMediaPost image = new ImageMediaPost("Kristina Kirpicheva", "20/06/20", "This is my uploaded image", MessageType.POST, 100, 200);
        AudioMediaPost audio = new AudioMediaPost("Kristina Kirpicheva", "20/06/20", "This is my uploaded audio", MessageType.POST, "Popular Singer", "Popular song");
        VideoMediaPost video = new VideoMediaPost("Kristina Kirpicheva", "20/06/20", "This is a cool video", MessageType.REPOST, "Cool vid");

        System.out.println("\n============== TextPost > Comment");

        // show comment info
        comment.getPostInfo();

        // print the comment
        comment.print();

        System.out.println("\n============== MediaPost > Image");

        // resizeImage
        image.resizeImage(10, 50, false);

        // print image
        image.print();

        System.out.println("\n============== MediaPost > Audio");

        // check audio length
        audio.cutAudioLength(5.0);

        // play audio
        audio.play();

        System.out.println("\n============== MediaPost > Video");

        // switch subtitles on
        video.setAutoSubtitles(true);

        // set autoplay
        video.setAutoPlay(true);

        // play video
        video.play();

    }

}
