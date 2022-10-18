package io.codelex.test14oct.ex1;

public class PayPal {
    public static void main(String[] args) {
        DebitCard andrew = new DebitCard(45129532541L,
                "Andrew Black", "045", 4500);
        CreditCard james = new CreditCard(49142568961L,
                "James Bush", "031", 800);

        andrew.bankStatement();
        james.bankStatement();

//        andrew.withdraw(10000);
        andrew.withdraw(2100);
        andrew.bankStatement();
        andrew.deposit(9000);
        andrew.bankStatement();


        james.deposit(200);
        james.bankStatement();
        james.withdraw(950);
        james.bankStatement();
        james.withdraw(100);


    }
}
