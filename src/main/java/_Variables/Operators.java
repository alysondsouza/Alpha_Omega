package _Variables;

public class Operators {
    //ASSIGNMENT
    public static int num = 10; //Initialize and assign a value; (global variable - inside the Class scope). //public global variables can be accessed between packages.

    public static void main(String[] args) { //MainMethod is static, so all the variables and methods it uses must only have one instance, which means they must also be static.
        int num1 = 1; //local variable - can only be used in its scope.
        updateInteger(num1);
    }


    public static void updateInteger(int num1) { //local variable from other scopes can be passed on as a parameter.
        int num2 = 2; //local variable - can only be used in its scope.
        num = num1 + num2; //This global variable has already initialized, but can be update to a new value.
        System.out.println("New value for 'num': " + num);
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