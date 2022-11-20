package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private final List<Object> theList;

    public MyList() {
        this.theList = new ArrayList<>();
    }

    public void add(int i, Object el) {
        theList.add(i, el);
    }

    public Object get(int i) {
        return theList.get(i);
    }

}
