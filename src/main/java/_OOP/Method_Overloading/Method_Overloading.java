//METHOD OVERLOADING

package _OOP.Method_Overloading;

public class Method_Overloading {
    //Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists(method signature) are different.
    //It is similar to constructor overloading, that allows a class to have more than one constructor having different argument lists.

    public static void main(String[] args) {

        overloadingMethodDiffParameters("myString", 100);
        overloadingMethodDiffParameters(200);
        overloadingMethodDiffParameters();

        calcFeetAndInchesToCentimeters(5, 9);
        calcFeetAndInchesToCentimeters(69);

    }

    //DIFF PARAMETERS
    public static void overloadingMethodDiffParameters(String myName, int myInt) {
        System.out.println("Method with 2 parameters: " + myName + " and " + myInt);
    }

    public static void overloadingMethodDiffParameters(int myInt) {
        System.out.println("Methos with 1 parameter: " + myInt);
    }

    public static void overloadingMethodDiffParameters() {
        System.out.println("Method with NO parameter.\n");
    }


    //FEET+INCHES - CM
    public static void calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + Math.round(centimeters) + " cm.\n");
    }

    //INCHES - FEET+INCHES - CM
    public static void calcFeetAndInchesToCentimeters(double inches) {
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");
        calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

