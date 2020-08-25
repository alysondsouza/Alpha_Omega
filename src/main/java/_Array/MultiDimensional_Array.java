//MULTI-DIMENSIONAL ARRAY

package _Array;

import java.util.Arrays;

public class MultiDimensional_Array {
    public static void main(String[] args) {

        //MULTI-DIMENSIONAL ARRAY REGULAR SIZE
        System.out.println("\nREGULAR Multidimensional Array");
        int multiDimArr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        //PRINT REGULAR-SIZE: Nested Fori Loop
        System.out.println("PRINT: Nested Fori Loop [i][j]");
        for (int i = 0; i < multiDimArr.length; i++) {
            for (int j = 0; j < multiDimArr.length; j++)
                System.out.print(multiDimArr[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        //PRINT REGULAR-SIZE: Fori Loop + Arrays.toString()
        System.out.println("PRINT: Fori Loop + Arrays.toString()");
        for (int i = 0; i < multiDimArr.length; i++) {
            System.out.println(Arrays.toString(multiDimArr[i]));
        }
        System.out.println();

        //MULTI-DIMENSIONAL ARRAY IRREGULAR SIZE
        System.out.println("\n\nIRREGULAR Multidimensional Array");
        int[][] multiDimIrregularArr = {{4, 3, 2, 1}, {7, 8, 9}, {5}, {6, 0, 1}};

        //PRINT IRREGULAR-SIZE: For-each Loop + Arrays.toString()
        System.out.println("PRINT: For-each Loop + Arrays.toString()");
        for (int[] row : multiDimIrregularArr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        //MULTI-DIMENSIONAL ARRAY IRREGULAR SIZE AND NULL VALUE
        System.out.println("\n\nIRREGULAR Multidimensional Array with NULL value");
        int[][] multiDimNullArr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                null,
                {8, 9}
        };

        //PRINT IRREGULAR-SIZE + NULL: Nested Fori Loop
        System.out.println("PRINT: Nested Fori Loop [i][j]");
        for (int i = 0; i < multiDimNullArr.length; i++) {
            for (int j = 0; (multiDimNullArr[i] != null && j < multiDimNullArr[i].length); j++)
                System.out.print(multiDimNullArr[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("PRINT: For-each + Fori Loop [i][j]");
        for (int[] ints : multiDimNullArr) {
            for (int j = 0; (ints != null && j < ints.length); j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }
        System.out.println();

        //PRINT IRREGULAR-SIZE + NULL: For-each Loop + IF
        System.out.println("PRINT: Fori Loop + IF");
        for (int[] row : multiDimNullArr) {
            if (row != null)
                for (int col : row)
                    System.out.print(col + " ");
            System.out.println();
        }
        System.out.println();
    }

}
