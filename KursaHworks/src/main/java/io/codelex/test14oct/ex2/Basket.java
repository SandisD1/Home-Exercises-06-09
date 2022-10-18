package io.codelex.test14oct.ex2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> contents;
    private int currentlyHolds;

    public Basket() {
        contents = new ArrayList<>();
        currentlyHolds = 0;
    }

    public void addToBasket(T content) {
        currentlyHolds = contents.size();
        if (currentlyHolds == 10) {
            throw new BasketFullException();
        }
        contents.add(content);
    }

    public void removeFromBasket(T content) {
        currentlyHolds = contents.size();
        if (currentlyHolds == 0) {
            throw new BasketEmptyException();
        }
        contents.remove(content);
    }

    public int getHolds() {
        return currentlyHolds = contents.size();
    }
}
