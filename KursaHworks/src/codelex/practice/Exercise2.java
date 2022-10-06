package codelex.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            Thread.dumpStack();
            System.out.println(e);
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            Thread.dumpStack();
            System.out.println(e);
        }
    }

    public static void methodC() throws ArithmeticException {

        try {
            int doomed = 12 / 0;
        } catch (ArithmeticException e) {
            Thread.dumpStack();
            System.out.println(e);
        }
    }
}
