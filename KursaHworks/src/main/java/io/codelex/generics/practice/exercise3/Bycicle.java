package io.codelex.generics.practice.exercise3;

public class Bycicle extends Transport {

    public Bycicle(int wheelCount) {
        super(wheelCount);
    }

    @Override
    public String toString() {
        return "Bycicle" + super.toString();
    }
}
