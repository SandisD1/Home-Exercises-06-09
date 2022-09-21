package io.codelex.classesandobjects.practice.ex1Product;

public class ProductApplication {
    public static void main(String[] args) {

        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product iPhone = new Product("iPhone 5s", 999.99, 3);
        Product epson = new Product("Epson EB-U05", 440.46, 1);

        mouse.printProduct();

        mouse.setCurrentAmount(20);
        mouse.setCurrentPrice(80.00);
        mouse.printProduct();

        iPhone.printProduct();
        iPhone.setCurrentAmount(10);
        iPhone.setCurrentPrice(873.42);
        iPhone.printProduct();

        epson.printProduct();
        epson.setCurrentAmount(4);
        epson.setCurrentPrice(455.50);
        epson.printProduct();
    }
}
