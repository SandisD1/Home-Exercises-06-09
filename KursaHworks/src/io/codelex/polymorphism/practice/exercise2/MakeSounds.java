package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Radio oldRadio = new Radio();
        Radio newerRadio = new Radio();
        Parrot johnny = new Parrot();
        Parrot vicious = new Parrot();
        Firework boom1 = new Firework();
        Firework boom2 = new Firework();
        List<Sound> orchestra = new ArrayList<>();
        orchestra.add(oldRadio);
        orchestra.add(newerRadio);
        orchestra.add(johnny);
        orchestra.add(vicious);
        orchestra.add(boom1);
        orchestra.add(boom2);
        for (Sound sou : orchestra) {
            sou.playSound();
        }
    }
}
