package _Loops;

public class _While {

    public static void main(String[] args) {


        //WHILE LOOP
        System.out.println("While Loop: (i < 5)"); //The while loop loops through a block of code as long as a specified condition is true
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("Value of 'i' after the loop: " + i);//i increments after 'print'
        System.out.println();

        //This condition is never met
        int l = 5;
        while (l < 5) {
            System.out.println(i);
            l++;
        }

        //DO-WHILE LOOP
        System.out.println("Do-While Loop: (j != 0)");
        int j = 6;
        do {
            System.out.println(j);
            j -= 2;
        }
        while (j != 0);
        System.out.println("Value of 'j' after the loop: " + j);
        System.out.println();

        //Even though the condition is never met the while loop will execute once, because the code block is executed before the condition is tested
        System.out.println("Do-While Loop: (k < 10)");
        int k = 10;
        do {
            System.out.println(k);
            k *= 2;
        }
        while (k < 10);
        System.out.println("Value of 'k' after the loop: " + k);//
        System.out.println();

        //BREAK AND CONTINUE
        System.out.println("Using Continue and Break Statements");
        int number = 0;
        while (number <= 20) {
            if (number == 2) {
                number++;
                continue; //skip particular recursion
            }
            if (number == 5) {
                break; //stop the loop execution
            }
            System.out.println(number);
            number++;
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