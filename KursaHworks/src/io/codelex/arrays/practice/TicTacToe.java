package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];
    static boolean xMove = true;
    static boolean gameOver = false;
    static char winner = '-';

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();
        gameplay();
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void gameplay() {
        Scanner keyboard = new Scanner(System.in);
        while (!gameOver) {
            if (xMove) {
                System.out.println("'X', choose your location (row, column): ");
                int x = keyboard.nextInt();
                x = acceptableValue(x);
                int y = keyboard.nextInt();
                y = acceptableValue(y);
                if (board[x][y] == ' ') {
                    board[x][y] = 'X';
                    displayBoard();
                    xMove = false;
                    winner();
                    isTie();
                } else {
                    System.out.println("Field taken, please pick another");
                    displayBoard();
                }
            }
            if (!xMove && !gameOver) {
                System.out.println("'O', choose your location (row, column): ");
                int x = keyboard.nextInt();
                x = acceptableValue(x);
                int y = keyboard.nextInt();
                y = acceptableValue(y);
                if (board[x][y] == ' ') {
                    board[x][y] = 'O';
                    displayBoard();
                    xMove = true;
                    winner();
                    isTie();
                } else {
                    System.out.println("Field taken, please pick another");
                    displayBoard();
                }
            }
        }
    }

    public static void winner() {
        if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && (board[0][0] != ' ')) {
            gameOver = true;
            winner = board[0][0];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && (board[1][0] != ' ')) {
            gameOver = true;
            winner = board[1][0];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && (board[2][0] != ' ')) {
            gameOver = true;
            winner = board[2][0];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]) && (board[0][0] != ' ')) {
            gameOver = true;
            winner = board[0][0];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) && (board[0][1] != ' ')) {
            gameOver = true;
            winner = board[0][1];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]) && (board[0][2] != ' ')) {
            gameOver = true;
            winner = board[0][2];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && (board[0][0] != ' ')) {
            gameOver = true;
            winner = board[0][0];
            System.out.println("Game over " + winner + " won!");
        }
        if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && (board[0][2] != ' ')) {
            gameOver = true;
            winner = board[0][2];
            System.out.println("Game over " + winner + " won!");
        }

    }

    public static int acceptableValue(int value) {
        Scanner keyboard = new Scanner(System.in);
        while ((value < 0) || (value > 2)) {
            System.out.println("PLease enter a 0, 1 or 2");
            value = keyboard.nextInt();
        }
        return value;
    }

    public static void isTie() {
        int gaps = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    gaps++;
                    break;
                }
            }
        }
        if (gaps == 0 && !gameOver) {
            gameOver = true;
            displayBoard();
            System.out.println("The game is a tie.");
        }
    }

}