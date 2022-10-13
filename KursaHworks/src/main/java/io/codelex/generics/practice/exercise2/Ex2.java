package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<String> singleString = new ArrayList<>();
        List<Integer> singleInt = new ArrayList<>();
        List<Object> singleOb = new ArrayList<>();
        singleString.add("word");
        singleInt.add(1);
        singleOb.add(new Object());

        String singleStringcon = concatenate(singleString);
        System.out.println(singleStringcon);

        String singleIntcon = concatenate(singleInt);
        System.out.println(singleIntcon);

        String singleObcon = concatenate(singleOb);
        System.out.println(singleObcon);

    }

    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";

        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        } else {
            result = list.get(0).getClass().getSimpleName();
            separator = " ";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }

}
