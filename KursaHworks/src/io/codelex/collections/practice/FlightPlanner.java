package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/main/resources/collections/flights.txt";

    private static final Map<String, Set<String>> flightOptions = new HashMap<>();

    private static final List<String> citySelect = new ArrayList<>();

    private static final List<String> route = new ArrayList<>();

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        generateFlightOptions();

        System.out.println("What would you like to do?");
        while (true) {
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press #");
            String menu = input.nextLine().trim();
            if (menu.equals("1")) {
                displayAllCities();
                System.out.println("To select a city from which you would like to start press 1");
                menu = input.nextLine().trim();
                if (menu.equals("1")) {
                    selectStartingCity();
                    selectDestinations();
                    printFlightPlan();
                    break;
                } else if (menu.equals("#")) {
                    break;
                }
            } else if (menu.equals("#")) {
                break;
            }
        }
    }

    public static void generateFlightOptions() throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flightList = Files.readAllLines(path, charset);

        for (String flight : flightList) {
            String[] currentFlight = flight.split("->");
            currentFlight[0] = currentFlight[0].trim();
            currentFlight[1] = currentFlight[1].trim();
            flightOptions.putIfAbsent(currentFlight[0], new HashSet<>());
            flightOptions.get(currentFlight[0]).add(currentFlight[1]);
            if (!citySelect.contains(currentFlight[0])) {
                citySelect.add(currentFlight[0]);
            }
        }
    }

    public static void displayAllCities() {
        for (String option : flightOptions.keySet()) {
            System.out.println(option);
        }
    }

    public static void selectStartingCity() {
        Scanner input = new Scanner(System.in);
        for (String city : citySelect) {
            System.out.println("Enter " + citySelect.indexOf(city) + " to select " + city);
        }
        String start = citySelect.get(input.nextInt());
        route.add(start);
        System.out.println("You chose " + start);
    }


    public static void selectDestinations() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please select out of your flight options");
            for (String target : flightOptions.get(route.get(route.size() - 1))) {
                System.out.println("Enter " + citySelect.indexOf(target) + " to select " + target);
            }
            String destination = citySelect.get(input.nextInt());
            if (flightOptions.get(route.get(route.size() - 1)).contains(destination)) {
                route.add(destination);
                System.out.println("You chose " + destination);
                if (destination.equals(route.get(0))) {
                    break;
                }
            } else {
                System.out.println("Please enter one of your options");
            }
        }
    }

    public static void printFlightPlan() {
        System.out.println("Your flight plan:");
        for (int i = 0; i < route.size() - 1; i++) {
            System.out.print(route.get(i) + " -> ");
        }
        System.out.println(route.get(route.size() - 1));
        System.out.println("Enjoy your trip.");
    }
}
