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
        if (currentlyHolds > 0) {
            if (content.getClass().getSimpleName().equals(contents.get(0).getClass().getSimpleName())) {
                try {
                    if (currentlyHolds == 10) {
                        throw new BasketFullException();
                    } else {
                        contents.add(content);
                    }
                } catch (BasketFullException e) {
                    System.out.println("Basket is full. Please remove something first");
                }
            }
        } else {
            contents.add(content);
        }


    }

    public void removeFromBasket(T content) {
        currentlyHolds = contents.size();
        try {
            if (currentlyHolds == 0) {
                throw new BasketEmptyException();
            }
            contents.remove(content);
        } catch (BasketEmptyException e) {
            System.out.println("Basket is expty. Please put something in first");
        }
    }

    public int getHolds() {
        return currentlyHolds = contents.size();

    }
}
