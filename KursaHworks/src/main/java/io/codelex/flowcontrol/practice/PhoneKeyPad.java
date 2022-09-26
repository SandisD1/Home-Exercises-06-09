package io.codelex.flowcontrol.practice;

import java.lang.*;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to convert:");
        String userString = input.nextLine().toUpperCase();
        for (int i = 0; i < userString.length(); i++) {
            char current = userString.charAt(i);
            switch (current) {
                case 'A':
                case 'B':
                case 'C':
                    System.out.print(2);
                    break;
                case 'D':
                case 'E':
                case 'F':
                    System.out.print(3);
                    break;
                case 'G':
                case 'H':
                case 'I':
                    System.out.print(4);
                    break;
                case 'J':
                case 'K':
                case 'L':
                    System.out.print(5);
                    break;
                case 'M':
                case 'N':
                case 'O':
                    System.out.print(6);
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    System.out.print(7);
                    break;
                case 'T':
                case 'U':
                case 'V':
                    System.out.print(8);
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    System.out.print(9);
                    break;

            }
        }
    }
}
/*          if (current =='A'||current =='B'||current == 'C') {
                  System.out.print(2);
                  } else if (current =='D'||current =='E'||current == 'F') {
                  System.out.print(3);
                  } else if (current =='G'||current =='H'||current == 'I') {
                  System.out.print(4);
                  } else if (current =='J'||current =='K'||current == 'L') {
                  System.out.print(5);
                  } else if (current =='M'||current =='N'||current == 'O') {
                  System.out.print(6);
                  } else if (current =='P'||current =='Q'||current == 'R'||current == 'S') {
                  System.out.print(7);
                  } else if (current =='T'||current =='U'||current == 'V') {
                  System.out.print(8);
                  } else if (current =='W'||current =='X'||current == 'Y'||current == 'Z') {
                  System.out.print(9);
 */