package io.codelex.test14oct.ex1;

public class DebitCard extends Card {

    public DebitCard(long cardNumber, String ownerName, String cvv, double balance) {
        super(cardNumber, ownerName, cvv, balance);
    }

    @Override
    public void deposit(double amount) {
        double total = super.getBalance() + amount;
        try {
            super.setBalance(total);
            if (total > 10000d) {
                throw new NotEnoughFundsException();
            }
        } catch (NotEnoughFundsException e) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void withdraw(double amount) {
        double total = super.getBalance() - amount;
        super.setBalance(total);
    }

    @Override
    public void bankStatement() {
        System.out.println(super.getOwnerName() + "'s Debit card. Card number - " + super.getCardNumber());
        System.out.println(" Balance : " + super.getBalance());
    }
}
