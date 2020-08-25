package _Collections;

import java.util.*;


//METHODS: ACCESS, UPDATE, INSERT, SEARCH and DELETE


public class Collections_Iterator {

    public static void main(String[] args) {

        //AS_LIST()
        System.out.println();
        System.out.println("Convert an Array into an ArrayList: Arrays.asList()");
        String[] strArr = {"We", "You", "They"};
        ArrayList<String> convertedArrList = new ArrayList<>(Arrays.asList(strArr));
        System.out.println(convertedArrList.toString());
        System.out.println();

        //TO_ARRAY() - OBJECT
        System.out.println("Convert an ArrayList into an Object[]: toArray()");
        Object[] arr = convertedArrList.toArray();
        System.out.println(arr.toString());//DOESN'T WORK
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println();

        //TO_ARRAY() - STRING
        System.out.println("Convert an ArrayList into a String[]: toArray()");
        String array[] = new String[convertedArrList.size()];
        array = convertedArrList.toArray(array);
        System.out.println(Arrays.toString(array));//WORKS
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();

        //BINARY_SEARCH
        System.out.println("Binary Search For 'You': binarySearch()");
        int binarySearch = Collections.binarySearch(convertedArrList, "You");
        System.out.println("'You' is at index [" + binarySearch + "]");
        System.out.println();

        //BINARY_SEARCH: -1
        System.out.println("Binary Search For 'You': binarySearch()");
        int bSearch = Collections.binarySearch(convertedArrList, "I");
        System.out.println("Index [" + bSearch + "] don't exist");
        System.out.println();

        //ITERATOR
        System.out.println("Transversing ArrayList with: iterator()");
        ArrayList<String> arrListColors = new ArrayList<String>(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"));
        Iterator<String> iterator = arrListColors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        //LIST_ITERATOR
        System.out.println("Transversing ArrayList forward and backwards with: listIterator()");
        ArrayList<String> arrListCities = new ArrayList<String>(Arrays.asList("Rio", "New York", "Copenhagen", "Auckland", "Buenos Aires"));
        ListIterator<String> listIterator = arrListCities.listIterator();
        System.out.println("-->Forward");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("<--backwards");

        while (listIterator.hasPrevious()) {
            System.out.println( listIterator.previous());
        }
        System.out.println();

        //COLLECTIONS - SORT()
        System.out.println("Order elements: Collections.sort()");
        Collections.sort(arrListCities);
        System.out.println(arrListCities.toString());
        System.out.println();

        //COLLECTIONS - SWAP()
        System.out.println("Swap elements by index: '[0]' and '[2]' - Collections.swap()");
        Collections.swap(arrListCities, 0, 2);
        System.out.println(arrListCities.toString());
        System.out.println();

        //COLLECTIONS - SHUFFLE()
        System.out.println("Shuffle randomly all elements - Collections.shuffle()");
        Collections.shuffle(arrListCities);
        System.out.println(arrListCities.toString());
        System.out.println();

        //COLLECTIONS - REVERSE()
        System.out.println("Reverse all elements - Collections.shuffle()");
        Collections.reverse(arrListCities);
        System.out.println(arrListCities.toString());
        System.out.println();

        //ADD_ALL()
        System.out.println("Copy all elements into the ArrayList - addAll()");
        ArrayList<String> addAllArr = new ArrayList<>();
        addAllArr.addAll(arrListCities);
        System.out.println(addAllArr.toString());
        addAllArr.addAll(arrListColors);
        System.out.println(addAllArr);
        System.out.println();

        //COLLECTIONS - REPLACE_ALL()
        System.out.println("Replace elements 'Red' with 'New Mexico' - Collections.replaceAll()");
        Collections.replaceAll(addAllArr, "Red", "New Mexico");
        System.out.println(addAllArr.toString());
        System.out.println();

        //REVERSE_ORDER() ALPHABETICALLY
        System.out.println("Prints a backwards alphabetically ordered list with: Collections.reverseOrder()");
        addAllArr.sort(Collections.reverseOrder());
        for (String s : addAllArr) {
            System.out.println(s);
        }
        System.out.println();

    }
}



//    Methods in Iterator Interface
//
//    forEach​(Consumer<? super T> action): Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
//    iterator(): Returns an iterator over elements of type T.   -->   next() hasNext()  remove()  forEachRemaining​(Consumer<? super E> action)
//    spliterator(): Creates a Spliterator over the elements described by this Iterable.


//    Methods in ListIterator Interface
//
//    add​(E e): Inserts the specified element into the list (optional operation).
//    hasNext(): Returns true if this list iterator has more elements when traversing the list in the forward direction.
//    hasPrevious(): Returns true if this list iterator has more elements when traversing the list in the reverse direction.
//    next(): Returns the next element in the list and advances the cursor position.
//    nextIndex(): Returns the index of the element that would be returned by a subsequent call to next().
//    previous(): Returns the previous element in the list and moves the cursor position backwards.
//    previousIndex(): Returns the index of the element that would be returned by a subsequent call to previous().
//    remove(): Removes from the list the last element that was returned by next() or previous() (optional operation).
//    set​(E e): Replaces the last element returned by next() or previous() with the specified element (optional operation).

//    Methods in Collections Interface
//
//    add​(E e): Ensures that this collection contains the specified element (optional operation).
//    addAll​(Collection<? extends E> c): Adds all of the elements in the specified collection to this collection (optional operation).
//    clear(): Removes all of the elements from this collection (optional operation).
//    contains​(Object o): Returns true if this collection contains the specified element.
//    containsAll​(Collection<?> c): Returns true if this collection contains all of the elements in the specified collection.
//    equals​(Object o): Compares the specified object with this collection for equality.
//    hashCode(): Returns the hash code value for this collection.
//    isEmpty(): Returns true if this collection contains no elements.
//    iterator(): Returns an iterator over the elements in this collection.
//    parallelStream(): Returns a possibly parallel Stream with this collection as its source.
//    remove​(Object o): Removes a single instance of the specified element from this collection, if it is present (optional operation).
//    removeAll​(Collection<?> c): Removes all of this collection's elements that are also contained in the specified collection (optional operation).
//    removeIf​(Predicate<? super E> filter): Removes all of the elements of this collection that satisfy the given predicate.
//    retainAll​(Collection<?> c): Retains only the elements in this collection that are contained in the specified collection (optional operation).
//    size(): Returns the number of elements in this collection.
//    spliterator(): Creates a Spliterator over the elements in this collection.
//    stream(): Returns a sequential Stream with this collection as its source.
//    toArray(): Returns an array containing all of the elements in this collection.
//    toArray​(IntFunction<T[]> generator): Returns an array containing all of the elements in this collection, using the provided generator function to allocate the returned array.
//    toArray​(T[] a): Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.

//    Methods in Collections Class
//
//    addAll​(Collection<? super T> c, T... elements): Adds all of the specified elements to the specified collection.
//    asLifoQueue​(Deque<T> deque): Returns a view of a Deque as a Last-in-first-out (Lifo) Queue.
//    binarySearch​(List<? extends Comparable<? super T>> list, T key): Searches the specified list for the specified object using the binary search algorithm.
//    binarySearch​(List<? extends T> list, T key, Comparator<? super T> c): Searches the specified list for the specified object using the binary search algorithm.
//    checkedCollection​(Collection<E> c, Class<E> type): Returns a dynamically typesafe view of the specified collection.
//    checkedList​(List<E> list, Class<E> type): Returns a dynamically typesafe view of the specified list.
//    checkedMap​(Map<K,​V> m, Class<K> keyType, Class<V> valueType): Returns a dynamically typesafe view of the specified map.
//    checkedNavigableMap​(NavigableMap<K,​V> m, Class<K> keyType, Class<V> valueType): Returns a dynamically typesafe view of the specified navigable map.
//    checkedNavigableSet​(NavigableSet<E> s, Class<E> type): Returns a dynamically typesafe view of the specified navigable set.
//    checkedQueue​(Queue<E> queue, Class<E> type): Returns a dynamically typesafe view of the specified queue.
//    checkedSet​(Set<E> s, Class<E> type): Returns a dynamically typesafe view of the specified set.
//    checkedSortedMap​(SortedMap<K,​V> m, Class<K> keyType, Class<V> valueType): Returns a dynamically typesafe view of the specified sorted map.
//    checkedSortedSet​(SortedSet<E> s, Class<E> type): Returns a dynamically typesafe view of the specified sorted set.
//    copy​(List<? super T> dest, List<? extends T> src): Copies all of the elements from one list into another.
//    disjoint​(Collection<?> c1, Collection<?> c2): Returns true if the two specified collections have no elements in common.
//    emptyEnumeration(): Returns an enumeration that has no elements.
//    emptyIterator(): Returns an iterator that has no elements.
//    emptyList(): Returns an empty list (immutable).
//    emptyListIterator(): Returns a list iterator that has no elements.
//    emptyMap(): Returns an empty map (immutable).
//    emptyNavigableMap(): Returns an empty navigable map (immutable).
//    emptyNavigableSet(): Returns an empty navigable set (immutable).
//    emptySet(): Returns an empty set (immutable).
//    emptySortedMap(): Returns an empty sorted map (immutable).
//    emptySortedSet(): Returns an empty sorted set (immutable).
//    enumeration​(Collection<T> c): Returns an enumeration over the specified collection.
//    fill​(List<? super T> list, T obj): Replaces all of the elements of the specified list with the specified element.
//    frequency​(Collection<?> c, Object o): Returns the number of elements in the specified collection equal to the specified object.
//    indexOfSubList​(List<?> source, List<?> target): Returns the starting position of the first occurrence of the specified target list within the specified source list, or -1 if there is no such occurrence.
//    lastIndexOfSubList​(List<?> source, List<?> target): Returns the starting position of the last occurrence of the specified target list within the specified source list, or -1 if there is no such occurrence.
//    list​(Enumeration<T> e): Returns an array list containing the elements returned by the specified enumeration in the order they are returned by the enumeration.
//    max​(Collection<? extends T> coll): Returns the maximum element of the given collection, according to the natural ordering of its elements.
//    max​(Collection<? extends T> coll, Comparator<? super T> comp): Returns the maximum element of the given collection, according to the order induced by the specified comparator.
//    min​(Collection<? extends T> coll): Returns the minimum element of the given collection, according to the natural ordering of its elements.
//    min​(Collection<? extends T> coll, Comparator<? super T> comp): Returns the minimum element of the given collection, according to the order induced by the specified comparator.
//    nCopies​(int n, T o): Returns an immutable list consisting of n copies of the specified object.
//    newSetFromMap​(Map<E,​Boolean> map): Returns a set backed by the specified map.
//    replaceAll​(List<T> list, T oldVal, T newVal): Replaces all occurrences of one specified value in a list with another.
//    reverse​(List<?> list): Reverses the order of the elements in the specified list.
//    reverseOrder(): Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface.
//    reverseOrder​(Comparator<T> cmp): Returns a comparator that imposes the reverse ordering of the specified comparator.
//    rotate​(List<?> list, int distance): Rotates the elements in the specified list by the specified distance.
//    shuffle​(List<?> list): Randomly permutes the specified list using a default source of randomness.
//    shuffle​(List<?> list, Random rnd): Randomly permute the specified list using the specified source of randomness.
//    singleton​(T o): Returns an immutable set containing only the specified object.
//    singletonList​(T o): Returns an immutable list containing only the specified object.
//    singletonMap​(K key, V value): Returns an immutable map, mapping only the specified key to the specified value.
//    sort​(List<T> list): Sorts the specified list into ascending order, according to the natural ordering of its elements.
//    sort​(List<T> list, Comparator<? super T> c): Sorts the specified list according to the order induced by the specified comparator.
//    swap​(List<?> list, int i, int j): Swaps the elements at the specified positions in the specified list.
//    synchronizedCollection​(Collection<T> c): Returns a synchronized (thread-safe) collection backed by the specified collection.
//    synchronizedList​(List<T> list): Returns a synchronized (thread-safe) list backed by the specified list.
//    synchronizedMap​(Map<K,​V> m): Returns a synchronized (thread-safe) map backed by the specified map.
//    synchronizedNavigableMap​(NavigableMap<K,​V> m): Returns a synchronized (thread-safe) navigable map backed by the specified navigable map.
//    synchronizedNavigableSet​(NavigableSet<T> s): Returns a synchronized (thread-safe) navigable set backed by the specified navigable set.
//    synchronizedSet​(Set<T> s): Returns a synchronized (thread-safe) set backed by the specified set.
//    synchronizedSortedMap​(SortedMap<K,​V> m): Returns a synchronized (thread-safe) sorted map backed by the specified sorted map.
//    synchronizedSortedSet​(SortedSet<T> s): Returns a synchronized (thread-safe) sorted set backed by the specified sorted set.
//    unmodifiableCollection​(Collection<? extends T> c): Returns an unmodifiable view of the specified collection.
//    unmodifiableList​(List<? extends T> list): Returns an unmodifiable view of the specified list.
//    unmodifiableMap​(Map<? extends K,​? extends V> m): Returns an unmodifiable view of the specified map.
//    unmodifiableNavigableMap​(NavigableMap<K,​? extends V> m): Returns an unmodifiable view of the specified navigable map.
//    unmodifiableNavigableSet​(NavigableSet<T> s): Returns an unmodifiable view of the specified navigable set.
//    unmodifiableSet​(Set<? extends T> s): Returns an unmodifiable view of the specified set.
//    unmodifiableSortedMap​(SortedMap<K,​? extends V> m): Returns an unmodifiable view of the specified sorted map.
//    unmodifiableSortedSet​(SortedSet<T> s): Returns an unmodifiable view of the specified sorted set.


