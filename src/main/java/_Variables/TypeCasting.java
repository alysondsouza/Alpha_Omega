package _Variables;

public class TypeCasting {

    //original format
    public static float floatNum = 10.0f;
    public static double doubleNum = 20.0;
    public static int intNum = 30;

    //automatic cast
    public static double castDoubleNum = 40.0f; //float->double
    public static short castShortNum = 50; //short->int

    //Type casting
    public static int doubleToIntNum = (int) 60.0; //double->int
    public static double doubleToFloatNum = (float) 70; //double->float
    public static double intToDoubleNum = (double) 80; //int->double (redundant)

    public static void main(String[] args) {
        printNumber();
    }

    public static void printNumber() {
        System.out.println("original format:");
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(intNum);
        System.out.println();

        System.out.println("Automatic casting:");
        System.out.println("(float->double): " + castDoubleNum);
        System.out.println("(short->int): " + castShortNum);
        System.out.println();

        System.out.println("Type Casting:");
        System.out.println("Typecasting (double->int): " + doubleToIntNum);
        System.out.println("Typecasting (double->float): " + doubleToFloatNum);
        System.out.println();
    }
}

//Byte: 8-bit
//Short: 16-bit
//Integer: 32-bit
//Long: 64-bit

//Float: 32-bits
//Double: 64-bits


//Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long
//float -> double

//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float
//long -> int -> char -> short -> byte



