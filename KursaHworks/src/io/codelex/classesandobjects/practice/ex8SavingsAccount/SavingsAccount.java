package io.codelex.classesandobjects.practice.ex8SavingsAccount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount {
    private BigDecimal balance;

    private BigDecimal annualInterest;

    private BigDecimal monthlyDeposit;

    private BigDecimal monthlyWithdraw;

    private BigDecimal totalDeposit = BigDecimal.valueOf(0);
    private BigDecimal totalWithdraw = BigDecimal.valueOf(0);
    private BigDecimal interestEarned = BigDecimal.valueOf(0);


    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAnnualInterest(BigDecimal annualInterest) {
        this.annualInterest = annualInterest;
    }

    public void setDeposit(BigDecimal deposit) {
        this.monthlyDeposit = deposit;
    }

    public void setWithdraw(BigDecimal withdraw) {
        this.monthlyWithdraw = withdraw;
    }

    public void withdraw() {
        totalWithdraw = totalWithdraw.add(monthlyWithdraw);
        balance = balance.subtract(monthlyWithdraw);
    }

    public void deposit() {
        totalDeposit = totalDeposit.add(monthlyDeposit);
        balance = balance.add(monthlyDeposit);
    }

    public void gainInterest() {
        BigDecimal monthlyInterest = annualInterest.divide(BigDecimal.valueOf(12), RoundingMode.HALF_UP);
        interestEarned = interestEarned.add(balance.multiply(monthlyInterest));
        balance = balance.add(balance.multiply(monthlyInterest));
    }


    public void printBankStatement() {

        System.out.printf("\n" + "Total deposited: $" + "%.2f", totalDeposit);
        System.out.printf("\n" + "Total withdrawn: $" + "%.2f", totalWithdraw);
        System.out.printf("\n" + "Interest earned: $" + "%.2f", interestEarned);
        System.out.printf("\n" + "Ending Balance: $" + "%.2f", balance);
    }
}
