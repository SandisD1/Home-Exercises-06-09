package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.getOrDefault(name, "No entry for that person");
    }

    public TreeMap<String, String> getData() {
        return data;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        PhoneEntry next = new PhoneEntry();
        next.name = name;
        next.number = number;

        data.put(next.name, next.number);
    }

    public void printDirectory() {
        for (Map.Entry<String, String> value : data.entrySet()) {
            System.out.println(value.getKey() + " : " + value.getValue());
        }
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "data=" + data +
                '}';
    }
}
