package io.codelex.classesandobjects.practice.ex13Account;

public class AccountApp {
    public static void main(String[] args) {
        Account first = new Account("John", 100);
        first.deposit(20);
        System.out.println(first + "\n");
        Account mattsAccount = new Account("Matt", 1000);
        Account mine = new Account("Me", 0);
        mattsAccount.withdrawal(100);
        mine.deposit(100);
        System.out.println(mattsAccount + "\n" + mine);


        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);

        System.out.println("\n" + A + "\n" + B + "\n" + C);

        Account.transfer(A, B, 50);
        Account.transfer(B, C, 25);


        System.out.println("\n" + A + "\n" + B + "\n" + C);


    }
}
