//HASH_SET: NO DUPLICATES

package _Collections;

import java.util.*;

public class Set_HashSet {

    public static void main(String[] args) {


        //INSTANTIATE ARRAY_LIST - WITH MULTIPLE VALUES
        System.out.println("Instantiate ArrayList - with values: ");
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("Banana", "Apple", "Pineapple", "Banana", "Orange"));
        System.out.println("ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(\"Banana\", \"Apple\", \"Pineapple\", \"Banana\", \"Orange\"));,");
        System.out.println("\nOriginal ArrayList: \n" + arrList.toString());
        System.out.println();

        //CREATES A HASH_SET IN ORDER TO ELIMINATE COPIES OF THE VARIABLE
        Set<String> fruits = new HashSet<String>(arrList);
        System.out.println("HashSet: NO DUPLICATES\n" + fruits.toString() + "\n");

        //BACK TO ARRAY
        ArrayList<String> noDuplicatesArr = new ArrayList<String>(fruits);
        System.out.println("Back to ArrayList:\n" + noDuplicatesArr.toString() + "\n");

        //PUTS INTO ALPHABETIC ORDER
        Collections.sort(noDuplicatesArr);
        System.out.println("Alphabetic Order: Collections.sort()\n" + noDuplicatesArr.toString() + "\n");

    }


}
