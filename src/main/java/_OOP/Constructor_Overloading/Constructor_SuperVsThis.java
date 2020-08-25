//CONSTRUCTOR OVERLOADING
//THIS
//SUPER

package _OOP.Constructor_Overloading;

public class Constructor_SuperVsThis {
    public static void main(String[] args) {

        System.out.println("THIS");
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);
        Rectangle r3 = new Rectangle(2, 4, 30, 40);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println();

        System.out.println("SUPER");
        RectangleShaped rs1 = new RectangleShaped(50, 60);
        RectangleShaped rs2 = new RectangleShaped(50, 60, 70, 80);
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println();
    }
 }


//THIS
class Rectangle {
    int x;
    int y;
    int width;
    int height;

    //1st constructor calls 2nd constructor
    public Rectangle() {
        this(0, 0);
    }

    //2nd constructor calls 3rd constructor
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    //3rd constructor initializes variables
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height;
    }
}

//SUPER
class Shape { //Superclass
    int x;
    int y;

    //superclass constructor
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class RectangleShaped extends Shape { //Child class
    int width;
    int height;

    //1st constructor calls 2nd constructor
    public RectangleShaped(int x, int y) {
        this(x, y, 0, 0);
    }

    //2nd constructor initializes variables
    public RectangleShaped(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height;
    }
}