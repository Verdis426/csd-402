
/*
 * CSD-402 Java for Programmers
 * Module 5 Assignment
 * Student: Verdis Moorer
 * Program: MoorerArrayLocations.java
 *
 * Description:
 * This program uses overloaded methods to locate the
 * largest and smallest elements in two-dimensional
 * integer and double arrays.
 */

import java.util.Arrays;

public class MoorerArrayLocations {

    // Locate the largest value in a double array.
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Locate the largest value in an integer array.
    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Locate the smallest value in a double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Locate the smallest value in an integer array.
    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int[][] intArray = {
            {4, 8, 2},
            {7, 3, 9},
            {1, 5, 6}
        };

        double[][] doubleArray = {
            {4.5, 8.2, 2.1},
            {7.3, 3.6, 9.8},
            {1.2, 5.4, 6.7}
        };

        System.out.println("Largest integer location: "
            + Arrays.toString(locateLargest(intArray)));

        System.out.println("Smallest integer location: "
            + Arrays.toString(locateSmallest(intArray)));

        System.out.println("Largest double location: "
            + Arrays.toString(locateLargest(doubleArray)));

        System.out.println("Smallest double location: "
            + Arrays.toString(locateSmallest(doubleArray)));
    }
}
