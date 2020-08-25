package _Array;


import java.util.Scanner;

public class Sort_Array_Algorithm {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Sorting Numbers.\nEnter " + capacity + " integer values:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < array.length - 1; i++) { //it will go through the fori-loop changing positions of 2 numbers whenever if==true. The flag==true will throw it once again into the fori-loop (as many times necessary). Fori-loop will always start from 0. When all numbers are in order: if==false, and therefor: flag==false, which in turn will break up the while loop.
                if (array[i] < array[i + 1]) { //is the second number bigger than the first number? true = change positions.
                    temp = array[i]; //saves the variable temporarily
                    array[i] = array[i + 1]; //overrides the variable
                    array[i + 1] = temp; //assign the temporary variable to it's new position
                    flag = true; //will keep while loop repeating itself until all numbers are in order and the if-statement is no longer true.
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value " + array[i]);
        }
    }
}
