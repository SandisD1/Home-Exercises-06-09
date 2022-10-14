package io.codelex.test14oct.ex2;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class BasketTest {
    @Test
    void cannotRemoveFromEmpty() {
        Basket first = new Basket<>();
        Apple a1 = new Apple();

        BasketEmptyException thrown = Assertions.assertThrows(BasketEmptyException.class, () -> {
            first.removeFromBasket(a1);
        }, "Basket is expty. Please put something in first");


        Assertions.assertEquals("Basket is expty. Please put something in first", thrown.getMessage());

    }
}
