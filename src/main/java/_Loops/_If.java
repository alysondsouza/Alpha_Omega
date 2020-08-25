package _Loops;

public class _If {
    static boolean isTrue = true;
    static boolean isFalse = false;
    static boolean isAlien = true;

    public static void main(String[] args) {


        //ONE-LINE IF STATEMENT
        if (isTrue) System.out.println("One line syntax: " + isTrue);
        if (!isFalse) System.out.println("One line syntax: " + isFalse);
        System.out.println();

        //SIMPLE SYNTAX
        if (isTrue == true)
            System.out.println(isTrue);
            System.out.println("This line will always be printed, because only the If Statement finishes by the first ';'.");
        System.out.println();

        if (isTrue == false)
            System.out.println(isTrue);
            System.out.println("This line is not part of the If Statement.");
        System.out.println();

        //IF STATEMENT CODE BLOCK
        if (isTrue) {
            System.out.println("{"+ isTrue);
            System.out.println("Everything between curly-brackets is part of If statement scope.}");
        }
        System.out.println();

        //SIMPLE IF-ELSE
        if (isAlien == true)
            System.out.println("I am an alien.");
        else
            System.out.println("I am not an alien.");
        System.out.println();

        //IF-ELSE CODE BLOCK
        if (!isAlien) {
            System.out.println("I am an alien.");
            System.out.println("I came from Mars.");
        }
        else {
            System.out.println("I am not an alien.");
            System.out.println("I am from Venus.");
        }
        System.out.println();

        //IF-ELSE/IF-ELSE CODE BLOCK
        int x = 10, y = 20;
        if (x > y)
            System.out.println(x + " is greater than " +y);
        else if (x < y)
                System.out.println(x + " is less than " +y);
        else if (x < y || x+y == 30) {
            System.out.println("x+y=" + (x + y));
            System.out.println("This code block will never be reached. Because th previous Else If statement is true."); //Be aware of the conditions logic
        }else
            System.out.println("Your logic is wrong.");

        System.out.println();


        //TERNARY OPERATOR ? :
        int a = 2, b = 1;
        int max = (a > b) ? a : b; //The condition, (a > b), is tested. If it is true the first value, a, is returned/assigned. Else, if it is false, the second value, b, is returned/assigned.
        System.out.println("Short if/else syntax: " + max);
        System.out.println();

        //ERROR
        System.out.println("Error:");
        if (isFalse = true) {
            System.out.println("In 'isFalse = true' you are not comparing, but simply assigning the variable a new value.");
            System.out.println("Be careful with = and ==.");
        }
        System.out.println();

    }
}


//        Summary of Operators

//        Simple Assignment Operator
//        =       Simple assignment operator Arithmetic Operators
//        +       Additive operator (also used for String concatenation)
//        -       Subtraction operator
//        *       Multiplication operator
//        /       Division operator
//        %       Remainder operator
//        %=
//        &=
//        |=
//        ^=
//        >>=
//        <<=

//        Unary Operators
//        +       Unary plus operator; indicates positive value (numbers are positive without this, however)
//        -       Unary minus operator; negates an expression
//        ++      Increment operator; increments a value by 1
//        --      Decrement operator; decrements a value by 1
//        !       Logical complement operator; inverts the value of a boolean

//        Equality and Relational Operators
//        ==      Equal to
//        !=      Not equal to
//        >       Greater than
//        >=      Greater than or equal to
//        <       Less than
//        <=      Less than or equal to

//        Conditional Operators
//        &&      Conditional-AND
//        ||      Conditional-OR
//        ?:      Ternary (shorthand for if-then-else statement)

//        Type Comparison Operator
//        instanceof      Compares an object to a specified type

//        Bitwise and Bit Shift Operators
//        ~       Unary bitwise complement
//        <<      Signed left shift
//        >>      Signed right shift
//        >>>     Unsigned right shift
//        &       Bitwise AND
//        ^       Bitwise exclusive OR
//        |       Bitwise inclusive OR


//        Operators	Precedence
//        postfix:              expr++ expr--
//        unary:                ++expr --expr +expr -expr ~ !
//        multiplicative:       * / %
//        additive:             + -
//        shift:                << >> >>>
//        relational:           < > <= >= instanceof
//        equality:             == !=
//        bitwise:              AND	&
//        bitwise exclusive:    OR	^
//        bitwise inclusive:    OR	|
//        logical:              AND	&&
//        logical:              OR	||
//        ternary:              ? :
//        assignment:           = += -= *= /= %= &= ^= |= <<= >>= >>>=