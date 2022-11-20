package io.codelex.generics.practice.exercise1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class myBigDecImpleList implements TheListInterface {
    private final List<BigDecimal> bigDecList;

    public myBigDecImpleList() {

        this.bigDecList = new ArrayList<>();
    }

    @Override
    public void add(int i, Object t) {
        bigDecList.add(i, BigDecimal.valueOf((int) t));
    }

    @Override
    public Object get(int i) {
        return bigDecList.get(i);
    }


}
