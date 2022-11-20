package io.codelex.oop.cars;

import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private Engine engine;
    private List<Manufacturer> manufacturerList;

    public Car(String name, String model, int price, int yearOfManufacture, Engine engine, List<Manufacturer> manufacturerList) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engine = engine;
        this.manufacturerList = manufacturerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfManufacture == car.yearOfManufacture &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(price, car.price) &&
                Objects.equals(manufacturerList, car.manufacturerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engine=" + engine +
                ", manufacturerList=" + manufacturerList.toString() +
                '}';
    }


    @Override
    public int compareTo(Car car) {
        return name.compareTo(car.getName());
    }
}
