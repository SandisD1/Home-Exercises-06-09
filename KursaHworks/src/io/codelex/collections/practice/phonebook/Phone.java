package io.codelex.collections.practice.phonebook;

public class Phone {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("John", "27652384");
        phoneDirectory.putNumber("James", "274391023");
        phoneDirectory.putNumber("Adam", "27384912");
        phoneDirectory.putNumber("Anton", "28903495");
        phoneDirectory.putNumber("James", "274397777");


        System.out.println(phoneDirectory.getNumber("James"));
        System.out.println(phoneDirectory.getNumber("Anton"));
        System.out.println(phoneDirectory.getNumber("Anne"));

        phoneDirectory.printDirectory();

        System.out.println(phoneDirectory);
        System.out.println(phoneDirectory.getData());
    }
}
