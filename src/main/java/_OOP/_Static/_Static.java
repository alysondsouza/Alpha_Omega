//STATIC

package _OOP._Static;

//Only a single copy of static variable is created and shared among all the instances of the class, they are class level variables.

//Static keyword is mainly used for memory management. It can be used with variables, methods, blocks and nested classes.
//It is a keyword which is used to share the same variable or method of a given class.
//Basically, static is used for a constant variable or a method that is same for every instance of a class.

class _Static {

    private static String name;

    public _Static(String name) {
        _Static.name = name;
    }

    public void printName() {
        System.out.println("name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Static variable:");
        _Static alpha = new _Static("Alpha");
        _Static beta = new _Static("Beta");
        alpha.printName();
        beta.printName();
    }

}