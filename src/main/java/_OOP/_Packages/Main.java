//PACKAGE
//IMPORT
//METHOD CALL

package _OOP._Packages; //That's the package you are at.

import _OOP._Packages.Package1.Pakg1Class; //You have to import the packages of the classes you use.
import _OOP._Packages.Package2.*;

public class Main {

    public static void main(String[] args) {
        mainClassMethod();

        //SAME SOURCE
        MyObject myObject = new MyObject();
        myObject.callMethodFromMain();
        myObject.myObjectMethod();

        //PACKAGE1
        Pakg1Class pakgObj1 = new Pakg1Class();
        pakgObj1.pkgClassMethod();
        pakgObj1.callMethodFromPakg2();

        //PACKAGE2
        Pakg2Class pakgObj2 = new Pakg2Class();
        pakgObj2.pkgClassMethod();
    }


    public static void mainClassMethod() {
        System.out.println("It's a method in Main.\n");
    }
}

//MAIN: Can't instantiate Main from inside a package if Main is in the java/scr folder.
