package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    private final List<T> listGeneric;

    public GenericList() {
        this.listGeneric = new ArrayList<>();
    }

    public void add(int i, T t) {
        listGeneric.add(i, t);
    }

    public T get(int i) {
        return listGeneric.get(i);
    }
}
