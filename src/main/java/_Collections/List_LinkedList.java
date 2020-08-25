package _Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedList {

    public static void main(String[] args) {
        //LINKED_LIST: USES POINTERS TO KEEP TRACK OF ELEMENTS
        //HEAD -- NODE -- NODE -- TAIL

        //INSTANTIATE ARRAY_LIST - WITH MULTIPLE VALUES
        System.out.println();
        System.out.println("Instantiate LinkedList - with values: ");
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList("Cat", "Spider", "Dog", "Bunny"));
        System.out.println("LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList(\"Cat\", \"Spider\", \"Dog\", \"Bunny\"));");
        System.out.println();

        //PRINT: toString()
        System.out.println("Print: toString():");
        System.out.println(linkedList.toString());
        System.out.println();

        //PRINT: foreach
        System.out.println("Print: For each Loop:");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println();

        //PUSH - Add to First Position
        System.out.println("Add element 'Bird' to LinkedList Head: push()");
        linkedList.push("Bird");
        System.out.println(linkedList.toString());
        System.out.println();

        //POP - Remove from First Position
        System.out.println("Remove element from LinkedList Head: pop()");
        linkedList.pop();
        System.out.println(linkedList.toString());
        System.out.println();

        //PEEK - Peek at the element at First Position
        System.out.println("Peek the last element: peek()");
        System.out.println(linkedList.peek());
        System.out.println(linkedList.toString());
        System.out.println();

        //ADD ELEMENT TO THE LINKED_LIST
        System.out.println("Add element 'Chicken,': add()");
        linkedList.add("Chicken");
        System.out.println(linkedList.toString());
        System.out.println();

        //ADD ELEMENT BY INDEX
        System.out.println("Add element 'Alligator' by index: '[3]' - add('index','element')");
        linkedList.add(3, "Alligator");
        System.out.println(linkedList.toString());
        System.out.println();

        //ADD ELEMENT: FIRST
        System.out.println("Add element 'Ant,': addFirst()");
        linkedList.addFirst("Ant");
        System.out.println(linkedList.toString());
        System.out.println();

        //ADD ELEMENT: LAST
        System.out.println("Add element 'Elephant,': addLast()");
        linkedList.addLast("Elephant");
        System.out.println(linkedList.toString());
        System.out.println();

        //SELECT ELEMENT: FIRST
        System.out.println("Select element the first element: getFirst()");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.toString());
        System.out.println();

        //SELECT ELEMENT: LAST
        System.out.println("Select element the last element: getLast()");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.toString());
        System.out.println();

        //SELECT ELEMENT BY INDEX
        System.out.println("Select element by index: '[4]' - get()");
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.toString());
        System.out.println();

        //REMOVE ELEMENT: FIRST
        System.out.println("Remove element the first element: removeFirst()");
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.toString());
        System.out.println();

        //SELECT ELEMENT: LAST
        System.out.println("Remove element the last element: removeLast()");
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.toString());
        System.out.println();

        //SELECT ELEMENT BY INDEX
        System.out.println("Remove element by index: '[3]' - get()");
        System.out.println(linkedList.remove(3));
        System.out.println(linkedList.toString());
        System.out.println();

        //SELECT ELEMENT BY OBJECT
        System.out.println("Remove element by object: 'Dog'");
        System.out.println(linkedList.remove("Dog"));
        System.out.println(linkedList.toString());
        System.out.println();

        //DESCENDING_ITERATOR
        Iterator it = linkedList.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}


//    Methods for Java LinkedList:
//
//    add​(int index, E element): This method Inserts the specified element at the specified position in this list.
//    add​(E e): This method Appends the specified element to the end of this list.
//    addAll​(int index, Collection c): This method Inserts all of the elements in the specified collection into this list, starting at the specified position.
//    addAll​(Collection c): This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.
//    addFirst​(E e): This method Inserts the specified element at the beginning of this list.
//    addLast​(E e): This method Appends the specified element to the end of this list.
//    clear​(): This method removes all of the elements from this list.
//    clone​(): This method returns a shallow copy of this LinkedList.
//    contains​(Object o): This method returns true if this list contains the specified element.
//    descendingIterator​(): This method returns an iterator over the elements in this deque in reverse sequential order.
//    element​(): This method retrieves, but does not remove, the head (first element) of this list.
//    get​(int index): This method returns the element at the specified position in this list.
//    getFirst​(): This method returns the first element in this list.
//    getLast​(): This method returns the last element in this list.
//    indexOf​(Object o): This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
//    lastIndexOf​(Object o): This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
//    listIterator​(int index): This method returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.
//    offer​(E e): This method Adds the specified element as the tail (last element) of this list.
//    offerFirst​(E e): This method Inserts the specified element at the front of this list.
//    offerLast​(E e): This method Inserts the specified element at the end of this list.
//    peek​(): This method retrieves, but does not remove, the head (first element) of this list.
//    peekFirst​(): This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
//    peekLast​(): This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
//    poll​(): This method retrieves and removes the head (first element) of this list.
//    pollFirst​(): This method retrieves and removes the first element of this list, or returns null if this list is empty.
//    pollLast​(): This method retrieves and removes the last element of this list, or returns null if this list is empty.
//    pop​(): This method Pops an element from the stack represented by this list.
//    push​(E e): This method Pushes an element onto the stack represented by this list.
//    remove​(): This method retrieves and removes the head (first element) of this list.
//    remove​(int index): This method removes the element at the specified position in this list.
//    remove​(Object o): This method removes the first occurrence of the specified element from this list, if it is present.
//    removeFirst​(): This method removes and returns the first element from this list.
//    removeFirstOccurrence​(Object o): This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
//    removeLast​(): This method removes and returns the last element from this list.
//    removeLastOccurrence​(Object o): This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
//    set​(int index, E element): This method replaces the element at the specified position in this list with the specified element.
//    size​(): This method returns the number of elements in this list.
//    spliterator​(): This method Creates a late-binding and fail-fast Spliterator over the elements in this list.
//    toArray​(): This method returns an array containing all of the elements in this list in proper sequence (from first to last element).
//    toArray​(T[] a): This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
//
//    java.util.AbstractSequentialList