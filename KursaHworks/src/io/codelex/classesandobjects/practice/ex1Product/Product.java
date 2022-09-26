package io.codelex.classesandobjects.practice.ex1Product;

public class Product {
    private final String name;
    private double currentPrice;
    private int currentAmount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.currentPrice = priceAtStart;
        this.currentAmount = amountAtStart;
    }

    public void printProduct() {
        System.out.print(name + ", ");
        System.out.print("price " + currentPrice + ", ");
        System.out.print("amount " + currentAmount);
        System.out.println();
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }
}
