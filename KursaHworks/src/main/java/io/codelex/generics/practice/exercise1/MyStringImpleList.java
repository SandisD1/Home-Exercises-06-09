package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyStringImpleList implements TheListInterface {
    private final List<String> stringList;

    public MyStringImpleList() {
        this.stringList = new ArrayList<>();
    }

    @Override
    public void add(int i, Object stringable) {
        stringList.add(i, String.valueOf(stringable));
    }

    @Override
    public Object get(int i) {
        return stringList.get(i);
    }
}
