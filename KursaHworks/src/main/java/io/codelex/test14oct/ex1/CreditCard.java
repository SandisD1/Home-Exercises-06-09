package io.codelex.test14oct.ex1;

public class CreditCard extends Card {

    public CreditCard(long cardNumber, String ownerName, String cvv, double balance) {
        super(cardNumber, ownerName, cvv, balance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() < 100d) {
            System.out.println("Warning: Low funds");
        }
    }

    @Override
    public void bankStatement() {
        System.out.println(getOwnerName() + "'s Credit card. Card number - " + getCardNumber());
        System.out.println(" Balance : " + getBalance());
    }
}
