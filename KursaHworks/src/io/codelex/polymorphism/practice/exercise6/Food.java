package io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    private final int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
