package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final int areaCm2;
    private final int numOfCopies;
    private final double costPerCm2;

    public Poster(int fee, int areaCm2, double costPerCm2, int numOfCopies) {
        super(fee);
        this.areaCm2 = areaCm2;
        this.costPerCm2 = costPerCm2;
        this.numOfCopies = numOfCopies;
    }

    public double costPer() {
        double costPerCopy = costPerCm2 * areaCm2;
        return costPerCopy;
    }

    public int cost() {
        int costOfPrint = (int) Math.ceil(numOfCopies * costPer());
        return super.cost() + costOfPrint;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster ad: Cost per copy = " + costPer() + " Number of copies = " + numOfCopies;
    }
}
