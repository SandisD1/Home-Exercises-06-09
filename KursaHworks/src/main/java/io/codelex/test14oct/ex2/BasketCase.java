package io.codelex.test14oct.ex2;

public class BasketCase {
    public static void main(String[] args) {
        Basket first = new Basket<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Mushroom m1 = new Mushroom();
        Mushroom m2 = new Mushroom();

        first.removeFromBasket(a1);
        System.out.println(first.getHolds());
        first.addToBasket(a1);
        System.out.println(first.getHolds());
        first.addToBasket(m1);
        System.out.println(first.getHolds());
        first.addToBasket(m2);
        System.out.println(first.getHolds());
        first.addToBasket(a1);
        first.addToBasket(a2);
        first.addToBasket(a2);
        first.addToBasket(a1);
        first.addToBasket(a1);
        first.addToBasket(a1);
        first.addToBasket(a1);
        System.out.println(first.getHolds());
        first.addToBasket(a1);
        System.out.println(first.getHolds());
        first.addToBasket(a1);
        System.out.println(first.getHolds());
        first.addToBasket(a1);
        System.out.println(first.getHolds());
        first.addToBasket(a1);
        System.out.println(first.getHolds());

    }
}
