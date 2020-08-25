package _Variables;

public class _Char {

    public static void main(String[] args) {
        charCodes();
    }

    public static void charCodes() {
        System.out.println("Char:\n");
        //Unicode
        System.out.println("Unicode-table.com");
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        System.out.println();

        //ASCII
        System.out.println("Ascii-code.com");
        int A = 65;
        char charA = (char) A;
        System.out.println(charA);
        System.out.println();
    }
}
