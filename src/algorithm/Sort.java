package algorithm;

import java.util.Arrays;
import java.util.Scanner;

 import java.util.Arrays;
import java.util.Scanner;

    public class Sort {



    long executionTime = 0;

     //Please implement all the sorting algorithm. Feel free to add helper methods.
     //Store all the sorted data into one of the databases.


    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
               if (array[i] < array[min])
                  min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
       final long startTime = System.currentTimeMillis();
        int[] list = array;
        // implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

}
