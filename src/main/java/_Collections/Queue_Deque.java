package _Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_Deque {

    public static void main(String[] args) {
        //WORKS AS A QUEUE AND A STACK AT THE SAME TIME

        Deque deque = new LinkedList();
        //OR
        Deque dequek = new ArrayDeque();

    }
}


//    Methods in Deque
//
//    add​(E e): Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
//    addAll​(Collection<? extends E> c): Adds all of the elements in the specified collection at the end of this deque, as if by calling addLast(E) on each one, in the order that they are returned by the collection's iterator.
//    addFirst​(E e): Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
//    addLast​(E e): Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
//    contains​(Object o): Returns true if this deque contains the specified element.
//    descendingIterator(): Returns an iterator over the elements in this deque in reverse sequential order.
//    element(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
//    getFirst(): Retrieves, but does not remove, the first element of this deque.
//    getLast(): Retrieves, but does not remove, the last element of this deque.
//    iterator(): Returns an iterator over the elements in this deque in proper sequence.
//    offer​(E e): Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
//    offerFirst​(E e): Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
//    offerLast​(E e): Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
//    peek(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
//    peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
//    peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
//    poll(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
//    pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
//    pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
//    pop(): Pops an element from the stack represented by this deque.
//    push​(E e): Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
//    remove(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
//    remove​(Object o): Removes the first occurrence of the specified element from this deque.
//    removeFirst(): Retrieves and removes the first element of this deque.
//    removeFirstOccurrence​(Object o): Removes the first occurrence of the specified element from this deque.
//    removeLast(): Retrieves and removes the last element of this deque.
//    removeLastOccurrence​(Object o): Removes the last occurrence of the specified element from this deque.
//    size(): Returns the number of elements in this deque.
