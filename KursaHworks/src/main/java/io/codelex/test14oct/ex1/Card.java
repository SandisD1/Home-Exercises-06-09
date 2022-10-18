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

    public long getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        double total = balance - amount;
        if (total < 0d) {
            throw new NotEnoughFundsException();
        }
        balance = total;
    }

    public abstract void bankStatement();
}
