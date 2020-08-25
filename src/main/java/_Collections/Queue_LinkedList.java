package _Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {

    public static void main(String[] args) {
        //QUEUE: FIFO - First in First Out
        //FRONT -- END

        //INSTANTIATE ARRAY_LIST - WITH MULTIPLE VALUES
        System.out.println();
        System.out.println("Instantiate LinkedList - with values: ");
        Queue<String> strQueue = new LinkedList<String>(Arrays.asList("Banana", "Apple", "Pear", "Orange"));
        System.out.println("Queue<String> strQueue = new LinkedList<String>(Arrays.asList(\"Banana\", \"Apple\", \"Pear\", \"Orange\"));");
        System.out.println();

        //PRINT: toString()
        System.out.println("Print: toString():");
        System.out.println(strQueue.toString());
        System.out.println();

        //PRINT: foreach
        System.out.println("Print: For each Loop:");
        for (String s : strQueue) {
            System.out.println(s);
        }
        System.out.println();

        //ADD - ENQUEUE AT THE END
        System.out.println("Enqueue 'Pineapple' element to the end of the Queue: add()");
        strQueue.add("Pineapple");
        System.out.println(strQueue.toString());
        System.out.println();

        //POLL - DEQUEUE AT THE FRONT
        System.out.println("Dequeue element at the front of the Queue: poll()");
        strQueue.poll();
        System.out.println(strQueue.toString());
        System.out.println();

        //REMOVE - DEQUEUE AT THE FRONT
        System.out.println("Dequeue element at the front of the Queue: remove()");
        strQueue.remove();
        System.out.println(strQueue.toString());
        System.out.println();

        //PEEK - Peek at the element at First Position
        System.out.println("Peek the element in front of the Queue: peek()");
        System.out.println(strQueue.peek());
        System.out.println(strQueue.toString());
        System.out.println();

        //SIZE - Size of the Queue
        System.out.println("Queue size: size()");
        System.out.println(strQueue.size());
        System.out.println(strQueue.toString());
        System.out.println();

    }
}


//    Methods in Queue: FIFO
//
//    add(): This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
//    peek(): This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
//    element(): This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
//    remove(): This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.
//    poll(): This method removes and returns the head of the queue. It returns null if the queue is empty.
//    size(): This method return the no. of elements in the queue.
//    offer(E e): Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
//
//    java.util.Collection
