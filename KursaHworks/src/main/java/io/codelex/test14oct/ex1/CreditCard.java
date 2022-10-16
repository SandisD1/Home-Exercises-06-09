package io.codelex.test14oct.ex1;

public class CreditCard extends Card {

    public CreditCard(long cardNumber, String ownerName, String cvv, double balance) {
        super(cardNumber, ownerName, cvv, balance);
    }

    @Override
    public void deposit(double amount) {
        double total = super.getBalance() + amount;
        super.setBalance(total);
    }

    @Override
    public void withdraw(double amount) {
        double total = super.getBalance() - amount;
        try {
            super.setBalance(total);
            if (total < 100d) {
                throw new NotEnoughFundsException();
            }
        } catch (NotEnoughFundsException e) {
            System.out.println("Warning: Low funds");
        }
    }

    @Override
    public void bankStatement() {
        System.out.println(super.getOwnerName() + "'s Credit card. Card number - " + super.getCardNumber());
        System.out.println(" Balance : " + super.getBalance());
    }
}
