package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    protected static List<Video> videoList = new ArrayList<>();

    public static void addVideo(String videoTitle) {
        videoList.add(new Video(videoTitle));
    }

    public static Video findVideo(String videoTitle) {
        for (Video vid : videoList) {
            if (vid.getTitle().equals(videoTitle)) {
                return vid;
            }
        }
        return null;
    }

    public static void checkOutVideo(String videoTitle) {
        Video current = findVideo(videoTitle);
        assert current != null;
        current.setCheckedOut(true);
    }

    public static void returnRentedVideo(String videoTitle) {
        Video current = findVideo(videoTitle);
        assert current != null;
        current.setCheckedOut(false);

    }

    public static void rateVideo(String videoTitle) {
        Video current = findVideo(videoTitle);
        assert current != null;
        current.rateVideo();
    }

    public static void seeInventory() {
        for (Video vid : videoList) {
            System.out.println(vid);
        }
    }

}
