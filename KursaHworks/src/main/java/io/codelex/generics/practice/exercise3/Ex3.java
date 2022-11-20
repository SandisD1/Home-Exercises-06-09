package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Bycicle> bycicleList = new ArrayList<>();
        List<MotorCycle> motorCycleList = new ArrayList<>();
        List<Transport> transportList = new ArrayList<>();

        Bycicle bike1 = new Bycicle(2);
        add(bike1, bycicleList);
        add(bike1, transportList);

        MotorCycle motorCycle1 = new MotorCycle(2, 10);
        add(motorCycle1, motorCycleList);
        add(motorCycle1, transportList);


//        addAllY(bycicleList, transportList);
        addAllX(motorCycleList, transportList);
        addAllX(bycicleList, transportList);

        transportList.forEach(v -> System.out.println(v.toString()));


    }

    public static <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }
}
