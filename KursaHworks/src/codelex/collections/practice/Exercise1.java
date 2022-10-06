package codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        String[] arrAsList = array;
        for (String contained : arrAsList) {
            System.out.println(contained);
        }
        //todo - replace array with a HashSet and print out the results
        Set<String> arrAsHash = new HashSet<>(Arrays.asList(array));
        for (String hashed : arrAsHash) {
            System.out.println(hashed);
        }
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> arrToMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String origin = "";
            if (array[i].equals("Audi") || array[i].equals("BMW") || array[i].equals("Mercedes") || array[i].equals("VolksWagen")) {
                origin = "Germany";
            }
            if (array[i].equals("Honda")) {
                origin = "Japan";
            }
            if (array[i].equals("Tesla")) {
                origin = "USA";
            }
            arrToMap.put(array[i], origin);
        }
        System.out.println(arrToMap);
    }
}
