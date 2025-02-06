package src;

import java.util.Arrays;

public class ArrayReview {
    public static void main (String[] args) {
        double[] doubleArray;
        doubleArray = new double[10];

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i;
        }
        System.out.println("After");
        printArray(doubleArray);
        sumArray(doubleArray);
    }



    public static void printArray(double[] anyArray) {
        // code in the function
        for (int i = 0; i < anyArray.length; i++) {
            System.out.println ("Value of doubleArray[" + i + "] is " + anyArray[i]);
        }
        System.out.println(Arrays.toString(anyArray));
    }

    public static void sumArray(double[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            int sum = 0;
            sum += anyArray[i];
        }
    }
}
