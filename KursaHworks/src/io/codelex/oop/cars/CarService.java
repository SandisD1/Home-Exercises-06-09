package io.codelex.oop.cars;

import java.util.List;

public class CarService {
    private List<Car> listOfCars;

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public void addCarToList (Car car) {
        listOfCars.add(car);
    }

    public void removeCarFromList (Car car) {
        listOfCars.remove(car);
    }
}
