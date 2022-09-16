package io.codelex.arithmetic.practice;

public class Ex6CozaLozaWoza {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder(" ");
        for (int i = 1; i <= 110; i++) {

            if (i % 3 == 0) {
                result.append("Coza");
            }
            if (i % 5 == 0) {
                result.append("Loza");
            }
            if (i % 7 == 0) {
                result.append("Woza");
            }
            if (result.toString().equals(" ")) {
                result.append(i);
            }
            if (i % 11 == 0) {
                result.append("\n");
            }
            System.out.print(result);
            result.replace(0, result.length(), " ");
        }

    }
}
