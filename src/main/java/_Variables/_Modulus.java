package _Variables;

import java.util.Scanner;

public class _Modulus {

    public static void main(String[] args) {

        System.out.println("\n\n MODULUS OPERATIONER \n\n");

        makeWall();

        makeChocolate();

        reverseNumber();

        leapYearCalc();
    }




    public static void makeWall() {
        System.out.println("We want to make a row of bricks that is goal inches long.\n" +
                "We have a number of small bricks (1 inch each) and big bricks (5 inches each)\n" +
                "Return true if it is possible to reach the goal by choosing from the given bricks.\n");

        boolean result1 = checkBrickSize(3, 1, 8);// → true
        System.out.println("Small bricks (1 inch): 3, Big bricks (5 inches): 1, Goal: 8 inches long. " + result1);
        boolean result2 = checkBrickSize(3, 1, 9);// → false
        System.out.println("Small bricks (1 inch): 3, Big bricks (5 inches): 1, Goal: 9 inches long. " + result2);
        boolean result3 = checkBrickSize(3, 2, 10);// → true
        System.out.println("Small bricks (1 inch): 3, Big bricks (5 inches): 2, Goal: 10 inches long. " + result3);
        boolean result4 = checkBrickSize(6, 3, 21);// → true
        System.out.println("Small bricks (1 inch): 6, Big bricks (5 inches): 3, Goal: 21 inches long. " + result4);
        boolean result5 = checkBrickSize(0, 3, 11);// → false
        System.out.println("Small bricks (1 inch): 0, Big bricks (5 inches): 3, Goal: 11 inches long. " + result5);
        boolean result6 = checkBrickSize(10, 1, 11);// → true
        System.out.println("Small bricks (1 inch): 10  Big bricks (5 inches): 1, Goal: 11 inches long. " + result6);
        boolean result7 = checkBrickSize(1, 4, 19);// → false
        System.out.println("Small bricks (1 inch): 1, Big bricks (5 inches): 4, Goal: 19 inches long. " + result7);
        boolean result8 = checkBrickSize(18, 1, 19);// → true
        System.out.println("Small bricks (1 inch): 18, Big bricks (5 inches): 1, Goal: 19 inches long. " + result8);

    }

    public static boolean checkBrickSize(int small, int big, int goal) {
        int digit = goal % 10;

        //IS THERE ENOUGH BRICKS?
        if (small + (big * 5) < goal) //if this condition is true: there is not enough bricks.
            return false;

        //THERE IS ENOUGH BRICKS!
        //QUESTION REMAINING: IS THERE ENOUGH SMALL BRICKS FOR THE PERFECT FITTING?
        if (digit < 5 && small < digit) //if both conditions are true: there is not enough small bricks.
            return false;
        else if (digit > 5 && small + 5 < digit) //if both conditions are true: there is not enough small bricks.
            return false;
        else
            return true;
    }

    public static void makeChocolate(){
            System.out.println("\n\nWe want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). " +
                    "\nReturn the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.\n");
    int result1 = checkChocolateSize(6, 2, 7);// → 2
        System.out.println("Small chocolate (1 kg): 6, Big chocolate (5 kg): 2, Goal: 7 kgs. " + result1);
    int result2 = checkChocolateSize(4, 1, 5);// → 0
        System.out.println("Small chocolate (1 kg): 4, Big chocolate (5 kg): 1, Goal: 5 kgs. " + result2);
    int result3 = checkChocolateSize(4, 1, 4);// → 4
        System.out.println("Small chocolate (1 kg): 4, Big chocolate (5 kg): 1, Goal: 4 kgs. " + result3);
    int result4 = checkChocolateSize(5, 4, 9);// → 4
        System.out.println("Small chocolate (1 kg): 5, Big chocolate (5 kg): 4, Goal: 9 kgs. " + result4);
    int result5 = checkChocolateSize(4, 1, 10);// → -1
        System.out.println("Small chocolate (1 kg): 4, Big chocolate (5 kg): 1, Goal: 10 kgs. " + result5);
    int result6 = checkChocolateSize(3, 1, 9);// → -1
        System.out.println("Small chocolate (1 kg): 3, Big chocolate (5 kg): 1, Goal: 9 kgs. " + result6);
}

    public static int checkChocolateSize(int small, int big, int goal) {
        //IS THERE ENOUGH CHOCOLATE?
        if (small + (big * 5) < goal || small < goal % 5) return -1; //check if has enough chocolate AND enough small chocolates to fill in the order.

        //THERE IS ENOUGH CHOCOLATE! WITH THE PERFECT SIZE.
        //QUESTION REMAINING: HOW MANY BIG CHOCOLATES ARE THERE
        if (big * 5 <= goal) return goal - big * 5; //if quantity less (or equal) than the goal, use all big chocolates, the difference is the amount of small chocolats necessary.
        return goal % 5; //Else, if there is plenty og chocolate, use all of them, the remainder is the amount of small chocolates necessary to fill the order.
    }

    public static void reverseNumber() {
        System.out.println();
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

    //Calculate if a given year is a Leap Year.
    public static void leapYearCalc() {
        Scanner reader = new Scanner(System.in);
        System.out.println("\n\nLeap year calculator:" +
                "\nEvery year that is exactly divisible by four is a leap year. Except for years that are exactly divisible by 100." +
                "\nBut these centurial years are leap years if they are exactly divisible by 400.");
        System.out.println("Enter the year you wish to calculate: ");

        int year = Integer.parseInt(reader.nextLine());

        if (year % 4 == 0 && year % 100 != 0) { //Every year that is exactly divisible by four is a leap year. Except for years that are exactly divisible by 100.
            System.out.println("The year is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) { //Every year that is exactly divisible by four //But these centurial years are leap years if they are exactly divisible by 400.
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }


}
