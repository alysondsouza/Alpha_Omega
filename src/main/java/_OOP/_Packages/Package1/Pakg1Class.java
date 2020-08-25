package _OOP._Packages.Package1; //That's the package you are at.

import _OOP._Packages.Package2.Pakg2Class; // Imported Package, to be able to use its methods.

public class Pakg1Class {

    public void pkgClassMethod() {
        System.out.println("You are inside Package1\n");
    }

    public void callMethodFromPakg2() {
        System.out.println("Call method from another package:");
        Pakg2Class pakg2Obj = new Pakg2Class();
        pakg2Obj.pkgClassMethod();
    }

}

//Can't call Main from inside a package if Main is in the java/scr folder.