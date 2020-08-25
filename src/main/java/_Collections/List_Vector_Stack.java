package _Collections;

import java.util.*;

public class List_Vector_Stack {

    public static void main(String[] args) {
        //STACK: LIFO - Last in First Out
        //BOTTOM -- TOP

        //INSTANTIATE ARRAY_LIST - WITH MULTIPLE VALUES
        System.out.println();
        System.out.println("Can't instantiate Stack - with values: ");
        System.out.println("Stack<String> strStack = new List<String>(Arrays.asList(\"DON'T\", \"WORK\"))");
        System.out.println();

        //INSTANTIATE WITH FOR-EACH LOOP - ARRAY TO STACK: add()
        Stack<String> strStack = new Stack<>();
        System.out.println("Stack<String> strStack = new Stack<>();");
        System.out.println();

        String[] strArr = {"Denmark", "USA", "Brazil", "New Zealand"};
        for (String s : strArr) {
            strStack.push(s);
        }

        //PRINT: toString()
        System.out.println("Print: toString():");
        System.out.println(strStack.toString());
        System.out.println();

        //PRINT: foreach
        System.out.println("Print: For each Loop:");
        for (String s : strStack) {
            System.out.println(s);
        }
        System.out.println();

        //PUSH - ADD TO THE TOP OF THE STACK
        System.out.println("Add element 'Greenland' to the top of the Stack: push()");
        strStack.push("Greenland");
        System.out.println(strStack.toString());
        System.out.println();

        //POP - REMOVE FROM TOP OF THE STACK
        System.out.println("Remove element from the top of the Stack: pop()");
        strStack.pop();
        System.out.println(strStack.toString());
        System.out.println();

        //REMOVE - REMOVE BY INDEX
        System.out.println("Remove element by index: '[1]' - remove()");
        strStack.remove(1);
        System.out.println(strStack.toString());
        System.out.println();

        //PEEK - Peek at the element on the top
        System.out.println("Peek the element at the top of the Stack: peek()");
        System.out.println(strStack.peek());
        System.out.println(strStack.toString());
        System.out.println();

        //SIZE - Size of the Stack
        System.out.println("Queue size: size()");
        System.out.println(strStack.size());
        System.out.println(strStack.toString());
        System.out.println();

    }
}


//    Methods in Stack: LIFO
//
//    empty(): Tests if this stack is empty. Returns true if the stack is empty, and returns false if the stack contains elements.
//    peek( ): Returns the element on the top of the stack, but does not remove it.
//    pop( ): Returns the element on the top of the stack, removing it in the process.
//    push(Object element): Pushes the element onto the stack. Element is also returned.
//    search(Object element): Searches for element in the stack. If found, its offset from the top of the stack is returned. Otherwise, -1 is returned.
//
//    java.util.Vector