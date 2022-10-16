package io.codelex.test14oct.ex1;

public abstract class Card {
    private final long cardNumber;
    private final String ownerName;
    private final String cvv;
    private double balance;

    public Card(long cardNumber, String ownerName, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.cvv = cvv;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCvv() {
        return cvv;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void bankStatement();
}
