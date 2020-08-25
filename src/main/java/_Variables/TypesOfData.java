package _Variables;

import java.time.LocalDate;
import java.util.*;

public class TypesOfData {

    //PRIMITIVE TYPES:

    //Boolean Types
    static boolean myBoolean = false;
    //Numeric Types
    //Character Types
    static char myChar = 'y';
    //Integral Types
    //Integer Types
    static byte myByte = 127;
    static short myShort = 847;
    static int myInteger = 88;
    static long myLong = 2_147_483_647_234L;
    //Floating-point Types
    static float myFloat = 324.3f;
    static double myDouble = 7.3243;

    //REFERENCED TYPES:

    //Non-Array Types
    //Wrapper Types
    static Integer integer;
    static Boolean aBoolean;
    static Double aDouble;
    //Non-Wrapper Types
    static String str = "string";
    static Date date;
    static LocalDate localDate = LocalDate.now();
    //Array Types
    static String[] strArr = {"I", "You", "He", "She", "It"};
    static int[] intArr = {1, 2, 3, 4, 5};
    static int[][] multiDimensionalArray = {{1, 2, 3}, {4, 5, 6}};
    static Object[] objects;
    //Collection Types
    static ArrayList<String> arrayList;
    static Queue<String> stringQueue;
    static Stack<String> stack;
    //Classes, Interfaces, enum, etc...


    public static void main(String[] args) {
        types();
    }


    public static void types() {
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(str);
        System.out.println(localDate);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.deepToString(multiDimensionalArray));
        System.out.println();

        //NUMBERS:
        //8-bit
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Busted MIN Value = " + (myMinByteValue + 1));
        System.out.println("Byte Busted MAX Value = " + (myMaxByteValue - 1));
        System.out.println();

        //16-bit
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println();

        //32-bit
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Integer Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Integer Busted MIN value = " + (myMinIntValue - 1));
        System.out.println();

        //64-bit
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println();


        //32-bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        System.out.println();

        //64-bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        System.out.println();
    }
}
