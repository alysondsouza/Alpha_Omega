//INHERITANCE: is-a relation
//SUPER()
//SUPER.
//OVERRIDDING METHOD
//INNER CLASS
//CONSTRUCTOR OVERLOADING

package _OOP._Inheritance;

public class _Inheritance {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("DELL");
        notebook.turnOnOff();
        System.out.println();

        Mobile mobile = new Mobile("Nokia");
        mobile.turnOnOff();
        System.out.println();

        Calculator calc = new Calculator("Cassio", 10);
        calc.calculate(); //Calculator method
        calc.turnOnOff(); //Machine method
        System.out.println();
    }


    //INNER CLASSES: MACHINE, NOTEBOOK, MOBILE and CALCULATOR
    //MACHINE (ABSTRACT) - Machine is abstract and can therefore not be instantiated.
    public static abstract class Machine {
        //CONSTRUCTOR
        public Machine(String model) {
        }

        //METHODS
        public void turnOnOff() {
            System.out.println("Machine turns On/Off button.");
        }
    }

    //NOTEBOOK
    public static class Notebook extends Machine {
        //CONSTRUCTOR
        public Notebook(String model) {
            super(model); //SUPER - it must inherit constructor from Machine
        }

        //METHODS - ARE AUTOMATICALLY INHERITED
    }

    //MOBILE
    public static class Mobile extends Machine {
        //CONSTRUCTOR
        public Mobile(String model) {
            super(model); //SUPER - it must inherit constructor from Machine
        }

        //METHODS
        @Override
        public void turnOnOff() {
            super.turnOnOff(); //SUPER - inherits method from Machine
            System.out.println("Nokia says Hello/Goodbye.");
        }
    }

    //CALCULATOR
    public static class Calculator extends Machine {
        //VARIABLES
        int size;

        //CONSTRUCTOR
        public Calculator(String model, int size) {
            super(model); //SUPER - it must inherit constructor from Machine
            this.size = size;
        }

        //METHODS
        public void calculate() {
            System.out.println("The calculator is computing.");
        }

        @Override //OVERRIDES MACHINE METHOD
        public void turnOnOff() {
            System.out.println("The calculator will turn off by itself after a minute.");
        }
    }
}
