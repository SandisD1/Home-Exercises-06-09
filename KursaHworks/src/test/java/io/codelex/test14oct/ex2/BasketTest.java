package io.codelex.test14oct.ex2;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class BasketTest {
    @Test
    void cannotRemoveFromEmpty() {
        Basket<Apple> appleBasket = new Basket<>();
        Apple a1 = new Apple();
        Assertions.assertThrows(BasketEmptyException.class,
                () -> appleBasket.removeFromBasket(a1));
    }

    @Test
    void cannotAddToFull() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom m1 = new Mushroom();

        mushroomBasket.addToBasket(m1); //1
        mushroomBasket.addToBasket(m1); //2
        mushroomBasket.addToBasket(m1); //3
        mushroomBasket.addToBasket(m1); //4
        mushroomBasket.addToBasket(m1); //5
        mushroomBasket.addToBasket(m1); //6
        mushroomBasket.addToBasket(m1); //7
        mushroomBasket.addToBasket(m1); //8
        mushroomBasket.addToBasket(m1); //9
        mushroomBasket.addToBasket(m1); //10

        Assertions.assertThrows(BasketFullException.class,
                () -> mushroomBasket.addToBasket(m1));
    }

    @Test
    void showsCorrenctContains() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom m1 = new Mushroom();

        mushroomBasket.addToBasket(m1); //1
        mushroomBasket.addToBasket(m1); //2
        mushroomBasket.addToBasket(m1); //3

        Assertions.assertEquals(3, mushroomBasket.getHolds());

    }
}
