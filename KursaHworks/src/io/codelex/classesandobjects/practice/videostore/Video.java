package io.codelex.classesandobjects.practice.videostore;

import java.util.Objects;
import java.util.Scanner;

public class Video {
    private final String title;
    private double currentRating;
    private int timesRated;
    boolean checkedOut;


    public Video(String title) {
        this.title = title;
        this.currentRating = 0;
        this.checkedOut = false;
        this.timesRated = 0;
    }

    public void rateVideo() {
        Scanner input = new Scanner(System.in);
        System.out.println("How would your rate this film?");
        double newRating = input.nextDouble();

        currentRating = (currentRating * timesRated + newRating) / (timesRated + 1);

        timesRated++;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return title.equals(video.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        if (!checkedOut) {
            return "Title: " + title + ", Viewer rating: "
                    + Math.round(currentRating * 10) / 10d + "  Currently available";
        } else {
            return "Title: " + title + ", Viewer rating: "
                    + Math.round(currentRating * 10) / 10d + "  Currently not available";
        }

    }
}
