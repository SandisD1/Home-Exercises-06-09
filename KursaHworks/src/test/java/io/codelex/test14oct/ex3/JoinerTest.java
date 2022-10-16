package io.codelex.test14oct.ex3;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class JoinerTest {

    @Test
    void joinsInts() {
        Joiner<Integer> joiner1 = new Joiner<>("-");
        String joined = joiner1.join(4, 6, 8, 10);
        Assertions.assertEquals("4-6-8-10", joined);
    }

    @Test
    void joinsStrings() {
        Joiner<String> joiner2 = new Joiner<>(" ");
        String joined = joiner2.join("Hello", "there", "world!", "Where?", "There!");
        Assertions.assertEquals("Hello there world! Where? There!", joined);
    }

    @Test
    void joinsColors() {
        Joiner<Color> colorJoiner = new Joiner<>(" and ");

        Color red = new Color("red");
        Color blue = new Color("blue");
        Color green = new Color("green");
        Color pink = new Color("pink");
        String joined = colorJoiner.join(red, blue, green, pink);
        Assertions.assertEquals("Color red and Color blue and Color green and Color pink", joined);
    }
}
