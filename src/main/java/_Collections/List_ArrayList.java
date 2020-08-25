//ARRAY_LIST - CAN GROW AND SHRINK AS NEEDED

package _Collections;

import java.util.*;

public class List_ArrayList {

    public static void main(String[] args) {

        //ARRAY TO ARRAY_LIST:
        System.out.println();
        System.out.println("Convert an Array into an ArrayList: Arrays.asList()");
        String[] strArr = {"We", "You", "They"};
        ArrayList<String> convertedArrList = new ArrayList<>(Arrays.asList(strArr));
        System.out.println(convertedArrList.toString());
        System.out.println();

        //ARRAY_LIST TO ARRAY: OBJECT
        System.out.println("Convert an ArrayList into an Object[]: toArray()");
        Object[] arr = convertedArrList.toArray();
        System.out.println(arr.toString());//DOESN'T WORK
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println();

        //ARRAY_LIST TO ARRAY: WRAPPER-CLASS
        System.out.println("Convert an ArrayList into a String[]: toArray()");
        String array[] = new String[convertedArrList.size()];
        array = convertedArrList.toArray(array);
        System.out.println(Arrays.toString(array));//WORKS
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();

        //INSTANTIATE ARRAY_LIST - WITH MULTIPLE VALUES
        System.out.println("Instantiate ArrayList - with values: ");
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("I", "You", "He", "She", "It"));
        System.out.println("ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(\"I\", \"You\", \"He\", \"She\", \"It\"));,");
        System.out.println();

        //PRINT: toString()
        System.out.println("Print: toString():");
        System.out.println(arrList.toString());
        System.out.println();

        //PRINT: foreach
        System.out.println("Print: For each Loop:");
        for (String s : arrList) {
            System.out.println(s);
        }
        System.out.println();

        //PRINT: ITERATOR
        System.out.println("Print: Iterator + hasNext()");
        Iterator<String> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        //PRINT: LIST_ITERATOR
        System.out.println("Print: listIterator()  + hasNext()");
        ListIterator<String> listIterator = arrList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();

        //COPY
        System.out.println("Copy: ");
        ArrayList<String> copyArr = new ArrayList<String>(arrList); //New List - Diff. references
        System.out.println("Original: " + arrList.toString());
        System.out.println("Copy: " + copyArr.toString());
        System.out.println();

        //SEARCH IN THE ARRAY_LIST: contains()
        System.out.println("ArrayList Search:");
        boolean contains = arrList.contains("She");
        System.out.println("arrList.contains(\"She\"): " + contains);
        System.out.println();

        //SEARCH IN THE ARRAY_LIST: indexOf()
        System.out.println("ArrayList Search:");
        int index1 = arrList.indexOf("He");
        System.out.println("arrList.indexOf(\"He\"): " + index1);
        System.out.println();

        //SEARCH NOT FOUND: -1 indexOf()
        System.out.println("ArrayList Search: (element not found)");
        int index2 = arrList.indexOf("They");
        System.out.println("arrList.indexOf(\"They\"): " + index2);
        System.out.println();

        //ADD ELEMENT TO THE ARRAY_LIST - AT THE END.
        System.out.println("Add element 'We': add()");
        String add1 = "We";
        arrList.add(add1);
        System.out.println(arrList.toString());
        System.out.println();

        //ADD ELEMENT BY INDEX
        System.out.println("Add element 'They' by index: '[2]' - add('index','element')");
        arrList.add(2, "They");
        System.out.println(arrList.toString());
        System.out.println();

        //REMOVE ELEMENT BY OBJECT
        System.out.println("Remove element by object: 'They'");
        arrList.remove("They");
        System.out.println(arrList.toString());
        System.out.println();

        //REMOVE ELEMENT BY INDEX
        System.out.println("Remove element by index: '[5]':");
        arrList.remove(5);
        System.out.println(arrList.toString());
        System.out.println();

        //REPLACE ELEMENT
        System.out.println("Replace an element at the index: 'They' at '[2]' - set()");
        arrList.set(2, "They");
        System.out.println(arrList.toString());
        System.out.println();

        //ADD_ALL()
        ArrayList<String> arrListColors = new ArrayList<String>(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"));
        ArrayList<String> arrListCities = new ArrayList<String>(Arrays.asList("Rio", "New York", "Copenhagen", "Auckland", "Buenos Aires"));
        ArrayList<String> addAllArr = new ArrayList<>();
        addAllArr.addAll(arrListCities);
        System.out.println(addAllArr.toString());
        addAllArr.addAll(arrListColors);
        System.out.println(addAllArr);
        System.out.println();

        //SUB_LIST() VIEW
        System.out.println("'View' arrayList by specified index: '3' '7' - subList()");
        System.out.println(addAllArr.subList(3, 7));
        System.out.println();

        //SUB_LIST() CUT
        System.out.println("Cut arrayList by specified index: '2' '8' - subList()");
        List<String> list = addAllArr.subList(2, 8);
        System.out.println(list);
        System.out.println();

        //ARRAY_LIST OF OBJECTS
        MyContacts contact1 = new MyContacts("John", 1234);
        MyContacts contact2 = new MyContacts("Mary", 4321);
        MyContacts contact3 = new MyContacts("Pete", 1243);
        ArrayList<MyContacts> myContacts = new ArrayList<MyContacts>();
        myContacts.add(contact1);
        myContacts.add(contact2);
        myContacts.add(contact3);

        //PRINT: FORI-LOOP ARRAY_LIST OF OBJECTS
        System.out.println("ArrayList of Objects: Fori Loop");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println("[" + i + "] " + "\tget(i).getName(): " +
                    myContacts.get(i).getName() + "\t\tget(i).getPhone(): " +
                    myContacts.get(i).getPhoneNumber());
        }
        System.out.println();

        //PRINT: TO_STRING
        System.out.println(myContacts.toString());
    }

}

//OBJECT
class MyContacts {
    private String name;
    private int phoneNumber;

    public MyContacts(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return " MyContacts { " +
                " name=' " + name + '\'' +
                " , phoneNumber= " + phoneNumber +
                " } ";
    }
}

//SORTING ALGORITHMS: INSERTION, MERGE, HEAP, BUBBLE, BUCKET, RADIX


//    Methods for Java ArrayList:
//
//    add​(int index, E element): Inserts the specified element at the specified position in this list.
//    add​(E e): Appends the specified element to the end of this list.
//    addAll​(int index, Collection<? extends E> c): Inserts all of the elements in the specified collection into this list, starting at the specified position.
//    addAll​(Collection<? extends E> c): Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
//    clear(): Removes all of the elements from this list.
//    clone(): Returns a shallow copy of this ArrayList instance.
//    contains​(Object o): Returns true if this list contains the specified element.
//    ensureCapacity​(int minCapacity): Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
//    forEach​(Consumer<? super E> action): Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
//    get​(int index): Returns the element at the specified position in this list.
//    indexOf​(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
//    isEmpty(): Returns true if this list contains no elements.
//    iterator(): Returns an iterator over the elements in this list in proper sequence.
//    lastIndexOf​(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
//    listIterator(): Returns a list iterator over the elements in this list (in proper sequence).
//    listIterator​(int index): Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
//    remove​(int index): Removes the element at the specified position in this list.
//    remove​(Object o): Removes the first occurrence of the specified element from this list, if it is present.
//    removeAll​(Collection<?> c): Removes from this list all of its elements that are contained in the specified collection.
//    removeIf​(Predicate<? super E> filter): Removes all of the elements of this collection that satisfy the given predicate.
//    removeRange​(int fromIndex, int toIndex): Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
//    retainAll​(Collection<?> c): Retains only the elements in this list that are contained in the specified collection.
//    set​(int index, E element): Replaces the element at the specified position in this list with the specified element.
//    size(): Returns the number of elements in this list.
//    spliterator(): Creates a late-binding and fail-fast Spliterator over the elements in this list.
//    subList​(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
//    toArray(): Returns an array containing all of the elements in this list in proper sequence (from first to last element).
//    toArray​(T[] a): Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
//    trimToSize(): Trims the capacity of this ArrayList instance to be the list's current size.
//
//    java.util.AbstractList