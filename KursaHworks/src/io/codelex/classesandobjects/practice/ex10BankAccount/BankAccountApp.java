package io.codelex.classesandobjects.practice.ex10BankAccount;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount myAccount = new BankAccount(input.nextLine(), input.nextBigDecimal());

        myAccount.deposit(input.nextBigDecimal());
        myAccount.withdraw(input.nextBigDecimal());

        System.out.println(myAccount);

    }
}
