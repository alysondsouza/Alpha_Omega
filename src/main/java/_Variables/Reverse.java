package _Variables;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        reverseNumber();

    }


    public static void reverseNumber() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = userInput.nextInt();
        System.out.print("The reverse number is: ");

        while (number > 9) {
            int digit = number % 10;
            int rest = number / 10;
            System.out.print(digit);
            number = rest;
            if (number < 10) {
                System.out.print(number);
            }
        }
    }
}