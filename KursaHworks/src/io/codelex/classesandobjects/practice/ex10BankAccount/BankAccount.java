package io.codelex.classesandobjects.practice.ex10BankAccount;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class BankAccount {
    public String name;
    public BigDecimal balance;

    public BankAccount(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public final void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        if (balance.compareTo(ZERO) < 0) {
            return name + ", -$" + balance.abs();
        } else {
            return name + ", $" + balance;
        }

    }
}
