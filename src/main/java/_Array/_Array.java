//ARRAY

package _Array;

import java.util.ArrayList;
import java.util.Arrays;

public class _Array {

    public static void main(String[] args) {

        //INITIALIZE EMPTY ARRAY
        int arraySize = 10;
        int[] myIntArray = new int[arraySize]; //Size 10: Array goes from 0 to 9.

        //ASSIGN VALUES
        myIntArray[2] = 33;
        myIntArray[7] = 15;

        //ACCESS SINGLE ELEMENT
        System.out.println("Access single element: myIntArray[2]: " + myIntArray[2]); // Single element
        System.out.println("Arrays.toString(): " + Arrays.toString(myIntArray)); // All elements
        System.out.println();

        //INITIALIZE ARRAY INLINE
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        //PRINT: ARRAYS.TO_STRING
        System.out.println("Arrays.toString(): " + Arrays.toString(cars));
        System.out.println();

        //PRINT: FORI LOOP (you can select index limits)
        System.out.println("FOR LOOP, every element in the array: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.print("index" + i + " = " + cars[i] + "\n");
        }
        System.out.println();

        //PRINT: FOR-EACH LOOP (without index)
        System.out.println("FOR-EACH, every element in the array: ");
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println();

        //FOR-EACH LOOP of elements +IF
        System.out.println("FOR-EACH + IF, goes through every element in the array: ");
        for (String i : cars) {
            if (i.equals("Mazda")) {
                System.out.println("Print If equals.(\"Mazda\")");
            }
        }
        System.out.println();

        //META-DATA
        System.out.println("META-DATA: Array 'cars' length: " + cars.length);
        System.out.println();

        //REFERENCE
        System.out.println("REFERENCE: String cars2[] = cars");
        String cars2[] = cars;
        System.out.println("Array cars " + Arrays.toString(cars));
        System.out.println("Arrays cars2 " + Arrays.toString(cars2));
        System.out.println("Changes in cars (Ferrari) will affect cars2, since it points to the same reference.");
        cars[0] = "Ferrari";
        System.out.println("Array cars " + Arrays.toString(cars));
        System.out.println("Arrays cars2 " + Arrays.toString(cars2));
        System.out.println();

        //COPY CONTENT FROM ARRAY TO THE NEW ARRAY
        System.out.println("CUT: Arrays.copyOfRange(indexFrom, indexTo) ->(0,2)");
        String[] myCopy = Arrays.copyOfRange(cars, 0, 2);
        System.out.println("Array cars " + Arrays.toString(cars));
        System.out.println("Array myCopy " + Arrays.toString(myCopy));
        System.out.println();

        //EXPAND ARRAY: ARRAYS.COPYOF
        System.out.println("EXPAND/COPY ARRAY: Arrays.copyOf()");
        System.out.println("Original size [4]: " + Arrays.toString(cars));
        String[] expandedArray = Arrays.copyOf(cars, cars.length + 2);
        System.out.println("Increasing Array size[6]: " + Arrays.toString(expandedArray));
        System.out.println();

        //JOIN ARRAY: ARRAYS.COPYOF + SYSTEM.ARRAYCOPY
        System.out.println("JOIN ARRAY: Arrays.copyOf() + System.arraycopy()");
        String[] first = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Original Array: " + Arrays.toString(first));
        String[] second = {"Nissan", "Peugeot", "Volkswagen", "Hyundai"};
        System.out.println("Original Array: " + Arrays.toString(second));

        String[] both = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, both, first.length, second.length); //(Object src, int srcPos, Object dest, int destPos, int length)
        System.out.println("Joined Array: " + Arrays.toString(both));
        System.out.println();

        //SPLIT STRING
        System.out.println("SPLIT String: \"223;Kuurt;Anton;Odense;Storkevej;18\"");
        String customer = "223;Kuurt;Anton;Odense;Storkevej;18";
        String[] customerArr = customer.split(";");
        System.out.println("Split by regex ';'\ncustomerArr[1]: Name: " + customerArr[1] + "\ncustomerArr[0]: Customer Number: " + customerArr[0]);
        System.out.println();

        //STRING ORDER //Transaction_date,Product,Price,Payment_Type,Name,City,State,Country,Account_Created,Last_Login,Latitude,Longitude
        System.out.println("SPLIT String: \"1/2/09 6:17,Product1,1200,Mastercard,carolina,Basildon,England,United Kingdom,1/2/09 6:00,1/2/09 6:08,51.5,-1.1166667\"");
        String paymentString = "1/2/09 6:17,Product1,1200,Mastercard,carolina,Basildon,England,United Kingdom,1/2/09 6:00,1/2/09 6:08,51.5,-1.1166667";
        String[] paymentArr = paymentString.split(",");
        System.out.println("Split by regex ';'\npaymentArr[4]: Customer: " + paymentArr[4] + "\npaymentArr[2]: Price " + Integer.parseInt(paymentArr[2]) + "\npaymentArr[10]: Latitude " + Double.parseDouble(paymentArr[10]));//TODO paymentArr[0]:Date " + LocalDateTime.parse(paymentArr[0])
        System.out.println();

        //SUM: FORI LOOP
        int[] sumMyArray = {10, 30, 50, 70};
        System.out.println("sumMyArr: " + Arrays.toString(sumMyArray));
        int sum = 0;
        for (int i = 0; i < sumMyArray.length; i++) {
            sum += sumMyArray[i];
        }
        System.out.println("SUM: " + sum);
        System.out.println();

        //ARRAY TO ARRAY_LIST:
        System.out.println("CONVERT: Arrays.asList()");
        ArrayList<String> convertedArrList = new ArrayList<>(Arrays.asList(cars));
        System.out.println("Array -> Array List: " + convertedArrList.toString());
        System.out.println();

        //ARRAY_LIST TO ARRAY:
        System.out.println("CONVERT: toArrays()");
        String[] backToArray = new String[convertedArrList.size()];
        backToArray = convertedArrList.toArray(backToArray);
        System.out.println("ArrayList -> Array: " + Arrays.toString(backToArray));
        System.out.println();


        //METHOD RETURN STRING
        System.out.println("RETURN Array;");
        String[] returnedArray = returnArrayMethod(cars);
        System.out.println("Array returned from the method: " + Arrays.toString(returnedArray));
    }

    //METHOD RETURN STRING
    public static String[] returnArrayMethod(String[] stringArray) {
        System.out.println("Array passed on to the method: " + Arrays.toString(stringArray));
        stringArray[0] = "Porsche";
        return stringArray;
    }

}

