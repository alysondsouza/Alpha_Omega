package _Variables;

public class _String {
    static int num1 = 10;
    static int num2 = 30;
    static String str = "50";

    public static void main(String[] args) {
        System.out.println("Print return: " + strAndNum());

    }

    public static int strAndNum() {


        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("str: " + str);
        System.out.println();

        System.out.println("num1 + num2 + str");
        System.out.println(num1 + num2 + str);
        System.out.println();

        System.out.println("str + num1 + num2");
        System.out.println(str + num1 + num2);
        System.out.println();

        return num1+num2;
    }

}
