package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyIntImpleList implements TheListInterface {
    private final List<Integer> intList;

    public MyIntImpleList() {
        this.intList = new ArrayList<>();
    }

    @Override
    public void add(int i, Object t) {
        intList.add(i, (int) t);
    }

    @Override
    public Object get(int i) {
        return intList.get(i);
    }
}
