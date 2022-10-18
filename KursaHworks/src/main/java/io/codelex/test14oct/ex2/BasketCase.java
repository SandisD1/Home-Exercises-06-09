package io.codelex.test14oct.ex2;

public class BasketCase {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket();
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Apple a1 = new Apple();
        Mushroom m1 = new Mushroom();

//        first.removeFromBasket(a1);
//        System.out.println(first.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
//        appleBasket.addToBasket(m1);
//        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
        appleBasket.addToBasket(a1);
        System.out.println(appleBasket.getHolds());
//        mushroomBasket.removeFromBasket(m1);
//        System.out.println(appleBasket.getHolds());
        System.out.println(mushroomBasket.getHolds());
        mushroomBasket.addToBasket(m1);
        System.out.println(mushroomBasket.getHolds());
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        System.out.println(mushroomBasket.getHolds());
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        mushroomBasket.addToBasket(m1);
        System.out.println(mushroomBasket.getHolds());
//        mushroomBasket.addToBasket(m1);


    }
}
