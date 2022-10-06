package codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> strList = new ArrayList<>();
        //TODO: Add 10 values to list
        strList.add("eleOne");
        strList.add("eleTwo");
        strList.add("eleThree");
        strList.add("eleFour");
        strList.add("eleFive");
        strList.add("eleSix");
        strList.add("eleSeven");
        strList.add("eleEight");
        strList.add("eleNine");
        strList.add("eleTen");
        //TODO: Add new value at 5th position
        strList.add(4, "Another eleFive");
        System.out.println(strList);
        //TODO: Change value at last position (Calculate last position programmatically)
        strList.remove(strList.size() - 1);
        strList.add("Changed last element");
        System.out.println(strList);
        //TODO: Sort your list in alphabetical order
        Collections.sort(strList);
        System.out.println(strList);
        //TODO: Check if your list contains "Foobar" element
        if (strList.contains("Foobar")) {
            System.out.println("Contains Foobar");
        } else {
            System.out.println("Does not contain Foobar");
        }
        //TODO: Print each element of list using loop
        for (String ele : strList) {
            System.out.println("* " + ele);
        }
    }

}
