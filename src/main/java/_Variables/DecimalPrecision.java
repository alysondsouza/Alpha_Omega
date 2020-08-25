package _Variables;

import java.math.BigDecimal;

public class DecimalPrecision {
    public static void main(String[] args) {
        precision();
    }

    public static void precision() {
        System.out.println("Precision:\n");
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("5/3 = ");
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
        System.out.println();

        double fraction = 0.1;
        double sum1 = fraction +fraction +fraction +fraction +fraction +fraction +fraction +fraction +fraction +fraction;
        System.out.println("double 0.1 + 0.1 + ...(10 times) = " + sum1);
        double sum2 = fraction * 10;
        System.out.println("double 0.1 * 10 = " + sum2);
        System.out.println();

        float ffraction = 0.1f;
        float sum3 = ffraction +ffraction +ffraction +ffraction +ffraction +ffraction +ffraction +ffraction +ffraction +ffraction;
        System.out.println("float 0.1 + 0.1 + ...(10 times) = " + sum3);
        double sum4 = ffraction * 10;
        System.out.println("float 0.1 * 10 = " + sum4);
        System.out.println();

        BigDecimal bdfraction = new BigDecimal("0.1");
        BigDecimal multiplyBy10 = new BigDecimal("10");
        BigDecimal sum5 = bdfraction.add(bdfraction).add(bdfraction).add(bdfraction).add(bdfraction).add(bdfraction).add(bdfraction).add(bdfraction).add(bdfraction).add(bdfraction);
        System.out.println("BigDecimal 0.1 + 0.1 + ...(10 times) = " + sum5);
        BigDecimal sum6 = bdfraction.multiply(multiplyBy10);
        System.out.println("BigDecimal 0.1 * 10 = " + sum6);
        System.out.println();
    }
}

//PRECISION:
//Computers do not use a base 10 system, they use a base 2 system (also called Binary code). Using only 1 and 0, a computer builds up a series of bits to represent all possible numbers,up to some maximum value allowed by its memory.
//For example 0 in Binary is "0" and 1 is "1". But 2, is already "10" because in Binary we do not have a "2", so we need to scale up, just like in Decimal we do not have anything after "9", so we have to scale up to 10. Anyway, going further, 3 in Binary is "11", 4 is "100", 5 is "101", and so on.
//Now, Rational numbers in most programming languages are called Floating numbers - due to various factors, they are an approximation of their equivalent in Decimal.
//For example "0.1" in Binary becomes "0.0001100110011001100110011001100110011001100110011001101", and "0.2" becomes "0.001100110011001100110011001100110011001100110011001101".