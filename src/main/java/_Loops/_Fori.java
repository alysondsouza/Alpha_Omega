package _Loops;

import java.util.Scanner;

public class _Fori {
    //(init; condition; increment){}

    public static void main(String[] args) {

        foriLoop(2, 6);
        foriBreakAndContinue(0, 20);

        pattern();

        primeNumber();

    }

    public static void foriLoop(int num, int x) {

        //SIMPLE FOR_I LOOP
        System.out.println("Loop starts at: " + num + " and it runs while less than " + x + ", incrementing 1 each time.");
        for (int i = num; i < x; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void foriBreakAndContinue(int num, int x) {

        //CONTINUE AND BREAK
        System.out.println("Using Continue and Break Statements");
        System.out.println("Loop starts at: " + num + " and it runs while less than " + x + ", incrementing 2 each time.");
        for (int i = num; i < x; i+=2) {
            if(i==4){
                continue; //skip particular recursion
            }
            if(i==10){
                break; //stop the loop execution
            }
            System.out.println(i);
        }
        System.out.println();
    }

    //NESTED FOR_I LOOP
    public static void pattern() {

        int rows = 5;

        //NESTED LOOP
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //NESTED LOOP + IF
        for (int i = 0; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //GROWING PATTERN
        for (int i = 9; i >= rows; i--) {
            for (int j = 9; j >= i - 3; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //NARROWING PATTERN
        for (int i = 1; i <= rows; ++i) {
            for (int j = 6; i <= j; --j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //TABLE OF 10
        int row = 10;
        int col = 10;
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void primeNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Find Prime Numbers.");
        System.out.print("Enter the first number : ");
        int start = s.nextInt();
        System.out.print("Enter the second number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        //You have to test every prime integer greater than 2, but less than or equal to the square root, assuming you are only testing odd numbers.
        //So if a number (greater than 1) is not prime and we test divisibility up to square root of the number, we will find one of the factors.
        //Conjecture: Every composite number has a proper factor less than or equal to its square root.
        if (n <= 1) { // Negative numbers and the number 1 are not prime.
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // The condition 'i < Math.sqrt(n)' is a way to optimize the code so it doesn't loop though every single number up to n.
            if (n % i == 0) { // A prime number cannot divide by itself.
                return false;
            }
        }
        return true;
    }
}




