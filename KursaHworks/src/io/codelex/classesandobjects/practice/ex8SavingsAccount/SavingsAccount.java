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
        BigDecimal monthlyInterest = annualInterest.divide(BigDecimal.valueOf(12), RoundingMode.HALF_EVEN);
        interestEarned = interestEarned.add(balance.multiply(monthlyInterest));
        balance = balance.add(balance.multiply(monthlyInterest));
    }


    public String printBankStatement() {

        System.out.println("totalDeposit $" + totalDeposit);
        System.out.println("totalWithdraw $" + totalWithdraw);
        System.out.println("interestEarned $" + interestEarned);
        System.out.println("balance $" + balance);
        return null;
    }
}
