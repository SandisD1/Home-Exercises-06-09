package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {
    private final List<Car> listOfCars;

    public CarService() {
        this.listOfCars = new ArrayList<>();
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public void addCarToList(Car car) {
        this.listOfCars.add(car);
    }

    public void removeCarFromList(Car car) {
        listOfCars.remove(car);
    }

    public List<Car> getListOfCarsByEngine(Engine engine) {
        List<Car> carsOfSpecifiedEngine = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getEngine().equals(engine)) {
                carsOfSpecifiedEngine.add(car);
            }
        }
        return carsOfSpecifiedEngine;
    }

    public List<Car> getCarsProducedBefore(int year) {
        List<Car> carsBeforeYear = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getYearOfManufacture() < year) {
                carsBeforeYear.add(car);
            }
        }
        return carsBeforeYear;
    }

    public Car getMostExpensive() {
        Car mostExpensive = getListOfCars().get(0);
        for (Car car : listOfCars) {
            if (car.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = car;
            }
        }
        return mostExpensive;
    }

    public Car getCheapest() {
        Car cheapest = getListOfCars().get(0);
        for (Car car : listOfCars) {
            if (car.getPrice() < cheapest.getPrice()) {
                cheapest = car;
            }
        }
        return cheapest;
    }

    public List<Car> carsWithNumManufact(int numOfMan) {
        List<Car> carsOfEnnoughMan = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getManufacturerList().size() >= numOfMan) {
                carsOfEnnoughMan.add(car);
            }
        }
        return carsOfEnnoughMan;
    }

    public boolean isPresentInList(Car car) {
        return listOfCars.contains(car);
    }

    public List<Car> carsProducedBy(Manufacturer manufacturer) {
        List<Car> carsByManufact = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getManufacturerList().contains(manufacturer)) {
                carsByManufact.add(car);
            }
        }
        return carsByManufact;
    }

    public List<Car> sorted(Comparator comparator) {
        if (comparator.equals(Comparator.ASCENDING)) {
            Collections.sort(listOfCars);
        }
        if (comparator.equals(Comparator.DESCENDING)) {
            Collections.reverse(listOfCars);
        }
        return listOfCars;
    }

    public List<Car> manufactByYOE(Comparator comparator, int year) {
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
        if (comparator.equals(Comparator.LESS_OR_EQUAL_TO)) {
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


    public void printList() {
        System.out.println("CarService currently contains :");
        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }
}
