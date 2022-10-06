package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {
    private static final List<Car> listOfCars = new ArrayList<>();


    public static List<Car> getListOfCars() {
        return listOfCars;
    }

    public static void addCarToList(Car car) {
        listOfCars.add(car);
    }

    public static void removeCarFromList(Car car) {
        listOfCars.remove(car);
    }

    public static List<Car> getListOfCarsByEngine(Engine engine) {
        List<Car> carsOfSpecifiedEngine = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getEngine().equals(engine)) {
                carsOfSpecifiedEngine.add(car);
            }
        }
        return carsOfSpecifiedEngine;
    }

    public static List<Car> getCarsProducedBefore(int year) {
        List<Car> carsBeforeYear = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getYearOfManufacture() < year) {
                carsBeforeYear.add(car);
            }
        }
        return carsBeforeYear;
    }

    public static Car getMostExpensive() {
        Car mostExpensive = getListOfCars().get(0);
        for (Car car : listOfCars) {
            if (car.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = car;
            }
        }
        return mostExpensive;
    }

    public static Car getCheapest() {
        Car cheapest = getListOfCars().get(0);
        for (Car car : listOfCars) {
            if (car.getPrice() < cheapest.getPrice()) {
                cheapest = car;
            }
        }
        return cheapest;
    }

    public static List<Car> carsWithNumManufact(int numOfMan) {
        List<Car> carsOfEnnoughMan = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getManufacturerList().size() >= numOfMan) {
                carsOfEnnoughMan.add(car);
            }
        }
        return carsOfEnnoughMan;
    }

    public static boolean isPresentInList(Car car) {
        return listOfCars.contains(car);
    }

    public static List<Car> carsProducedBy(Manufacturer manufacturer) {
        List<Car> carsByManufact = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getManufacturerList().contains(manufacturer)) {
                carsByManufact.add(car);
            }
        }
        return carsByManufact;
    }

    public static List<Car> sorted(Comparator comparator) {
        if (comparator.equals(Comparator.ASCENDING)) {
            Collections.sort(listOfCars);
        }
        if (comparator.equals(Comparator.DESCENDING)) {
            Collections.reverse(listOfCars);
        }
        return listOfCars;
    }

    public static List<Car> manufactByYOE(Comparator comparator, int year) {
        List<Car> carsByManufactYear = new ArrayList<>();
        if (comparator.equals(Comparator.MORE_THAN)) {
            for (Car car : listOfCars) {
                for (Manufacturer manu : car.getManufacturerList()) {
                    if (manu.getYearOfEstablishment() > year) {
                        carsByManufactYear.add(car);
                        break;
                    }
                }
            }
        }
        if (comparator.equals(Comparator.MORE_OR_EQUAL_TO)) {
            for (Car car : listOfCars) {
                for (Manufacturer manu : car.getManufacturerList()) {
                    if (manu.getYearOfEstablishment() >= year) {
                        carsByManufactYear.add(car);
                        break;
                    }
                }
            }
        }
        if (comparator.equals(Comparator.LESS_THAN)) {
            for (Car car : listOfCars) {
                for (Manufacturer manu : car.getManufacturerList()) {
                    if (manu.getYearOfEstablishment() < year) {
                        carsByManufactYear.add(car);
                        break;
                    }
                }
            }
        }
        if (comparator.equals(Comparator.LESS_OR_EAQUAL_TO)) {
            for (Car car : listOfCars) {
                for (Manufacturer manu : car.getManufacturerList()) {
                    if (manu.getYearOfEstablishment() <= year) {
                        carsByManufactYear.add(car);
                        break;
                    }
                }
            }
        }
        if (comparator.equals(Comparator.EQUAL_TO)) {
            for (Car car : listOfCars) {
                for (Manufacturer manu : car.getManufacturerList()) {
                    if (manu.getYearOfEstablishment() == year) {
                        carsByManufactYear.add(car);
                        break;
                    }
                }
            }
        }
        if (comparator.equals(Comparator.ALL_EXCEPT)) {
            for (Car car : listOfCars) {
                for (Manufacturer manu : car.getManufacturerList()) {
                    if (manu.getYearOfEstablishment() != year) {
                        carsByManufactYear.add(car);
                        break;
                    }
                }
            }
        }

        return carsByManufactYear;
    }


    public static void printList() {
        System.out.println("CarService currently contains :");
        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }
}
