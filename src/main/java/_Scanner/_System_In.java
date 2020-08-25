package _Scanner;

import java.util.Scanner;

public class _System_In {

    public static void main(String[] args) {

        userInput();

        hasNextInt();

        keepTrackOfMinMaxValues();

    }

    public static void userInput() {
        //NEXT_INT
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an integer: ");
        int num = scanner.nextInt();
        System.out.println("The number is: " + num);
        //SCANNER BUG  (needs to read an extra line when going from a number to string)
        scanner.nextLine(); //handles end of line (enter key)

        //NEXT_LINE
        System.out.println("\nEnter a string: ");
        String str = scanner.nextLine();
        System.out.println("The string is: " + str);
    }

    // HAS_NEXT_INT validates if the entry is a number
    public static void hasNextInt() {
        Scanner scanner = new Scanner(System.in); //The scanner auto-closes
        System.out.println("\nValidate integer entry.\nEnter an integer: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int num = scanner.nextInt();
            System.out.println("Validated number is: " + num);
        } else {
            System.out.println("\nInvalid Entry.\nPlease enter a number.");
            hasNextInt();
        }
        scanner.close(); //Although it's not necessary here, it can br useful to force close while doing recursion to avoid scanner-bugs
    }

    // HAS_NEXT_INT + RECURSION
    public static void keepTrackOfMinMaxValues() {

        int min = 0; //Integer.MAX_VALUE; (alternatively to the use of the flag)
        int max = 0; //Integer.MIN_VALUE; (alternatively to the use of the flag)

        boolean first = true; //flag

        System.out.println("\nKeep track of the max and min values.\n(Enter a letter to break the loop)\n");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) { //if scanner input is an integer == true

                int number = scanner.nextInt(); //assign that number to a variable

                if (first) { //flag (assign new values for min and max)
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) { //keep the highest number
                    max = number;
                }

                if (number < min) { //keep the lowest number
                    min = number;
                }

            } else {
                break; //exit the loop when the user input is different then an integer
            }

        }

        System.out.println("\nmin= " + min + ", max= " + max);
    }

}
