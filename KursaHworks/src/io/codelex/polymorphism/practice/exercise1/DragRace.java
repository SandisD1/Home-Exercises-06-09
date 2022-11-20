package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Audi audi = new Audi();
        carList.add(audi);
        Bmw bmw = new Bmw();
        carList.add(bmw);
        Dodge dodge = new Dodge();
        carList.add(dodge);
        Lexus lexus = new Lexus();
        carList.add(lexus);
        Nissan nissan = new Nissan();
        carList.add(nissan);
        Tesla tesla = new Tesla();
        carList.add(tesla);
        int topSpeed = 0;
        for (int i = 0; i < 10; i++) {
            for (Car car : carList) {
                if (i == 0) {
                    car.startEngine();
                }
                car.speedUp();
                if (i == 2 && car instanceof NOS) {
                    ((NOS) car).useNitrousOxideEngine();
                }
                if (car.getCurrentSpeed() > topSpeed) {
                    topSpeed = car.getCurrentSpeed();
                }
            }
        }

        for (Car car : carList) {
//            System.out.println(car.getCurrentSpeed());
            if (car.getCurrentSpeed() == topSpeed) {
                System.out.println(car);
            }
        }


    }
}
