package _OOP._Packages;

public class MyObject {

    public void callMethodFromMain() {
        System.out.println("Call method in main from MyObject:");
        Main.mainClassMethod(); //You can call Main here since its in the same folder
    }

    public void myObjectMethod() {
        System.out.println("It's a method in myObject.\n");
    }


}