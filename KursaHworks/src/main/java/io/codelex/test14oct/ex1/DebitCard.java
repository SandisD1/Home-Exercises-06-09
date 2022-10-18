package io.codelex.test14oct.ex1;

public class DebitCard extends Card {

    public DebitCard(long cardNumber, String ownerName, String cvv, double balance) {
        super(cardNumber, ownerName, cvv, balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (getBalance() > 10000d) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void bankStatement() {
        System.out.println(getOwnerName() + "'s Debit card. Card number - " + getCardNumber());
        System.out.println(" Balance : " + getBalance());
    }
}
