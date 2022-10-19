package io.codelex.classesandobjects.practice.ex8SavingsAccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money is in the account?: ");
        SavingsAccount myAccount = new SavingsAccount(BigDecimal.valueOf(input.nextDouble()));

        System.out.println("Enter the annual interest rate: ");
        myAccount.setAnnualInterest(BigDecimal.valueOf(input.nextDouble()));

        System.out.println("How long has the account been opened?");
        int monthsActive = input.nextInt();

        for (int i = 1; i <= monthsActive; i++) {
            System.out.println("Enter amount deposited for month " + i + " :");
            myAccount.setDeposit(BigDecimal.valueOf(input.nextDouble()));
            myAccount.deposit();
            System.out.println("Enter amount withdrawn for month " + i + " :");
            myAccount.setWithdraw(BigDecimal.valueOf(input.nextDouble()));
            myAccount.withdraw();
            myAccount.gainInterest();

        }
        myAccount.printBankStatement();

    }
}
