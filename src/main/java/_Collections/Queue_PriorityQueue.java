package _Collections;

import java.util.PriorityQueue;

public class Queue_PriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<String> pQueue = new PriorityQueue<String>();

    }
}


//    Methods in PriorityQueue
//
//    add​(E e)	Inserts the specified element into this priority queue.
//    clear()	Removes all of the elements from this priority queue.
//    comparator()	Returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements.
//    contains​(Object o)	Returns true if this queue contains the specified element.
//    forEach​(Consumer<? super E> action)	Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
//    iterator()	Returns an iterator over the elements in this queue.
//    offer​(E e)	Inserts the specified element into this priority queue.
//    remove​(Object o)	Removes a single instance of the specified element from this queue, if it is present.
//    removeAll​(Collection<?> c)	Removes all of this collection's elements that are also contained in the specified collection (optional operation).
//    removeIf​(Predicate<? super E> filter)	Removes all of the elements of this collection that satisfy the given predicate.
//    retainAll​(Collection<?> c)	Retains only the elements in this collection that are contained in the specified collection (optional operation).
//    spliterator()	Creates a late-binding and fail-fast Spliterator over the elements in this queue.
//    toArray()	Returns an array containing all of the elements in this queue.
//    toArray​(T[] a)	Returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array.
//    peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
//    poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.