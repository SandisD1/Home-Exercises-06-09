package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

import static io.codelex.classesandobjects.practice.videostore.VideoStore.*;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a video (as user)");
            System.out.println("Choose 5 to see Videos in store (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    rateAVideo(keyboard);
                    break;
                case 5:
                    seeInventory();
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        scanner.nextLine();
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            addVideo(movieName);

        }
    }

    private static void rentVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Which video would you like to rent?");
        String rentTitle = scanner.nextLine();
        checkOutVideo(rentTitle);
    }

    private static void returnVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Which video would you like to return?");
        String rentTitle = scanner.nextLine();
        returnRentedVideo(rentTitle);
    }

    private static void rateAVideo(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Which video would you like to rate?");
        String rentTitle = scanner.nextLine();
        rateVideo(rentTitle);
    }
}
