package io.codelex.test14oct.ex3;

public class JoinApp {
    public static void main(String[] args) {

        Joiner<Integer> joiner1 = new Joiner<>("-");

        System.out.println(joiner1.join(1, 2, 3, 4, 5));

        Joiner<String> joiner2 = new Joiner<>(" ");

        System.out.println(joiner2.join("Hey", "you", "out", "there"));

        Joiner<Color> colorJoiner = new Joiner<>(" and ");

        Color red = new Color("red");
        Color blue = new Color("blue");
        Color green = new Color("green");
        Color yellow = new Color("yellow");
        Color black = new Color("black");

        System.out.println(colorJoiner.join(red, blue, green, yellow, black));


    }

}
