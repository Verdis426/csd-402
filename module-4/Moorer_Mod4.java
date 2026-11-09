
import java.util.Arrays;

/**
 * Student: Verdis Moorer
 * Course: CSD-402
 * Module 4: Method Overloading
 *
 * This program uses four overloaded methods to
 * calculate the average of different array types.
 */
public class Moorer_Mod4 {

    // Calculate the average of a short array.
    public static short average(short[] array) {
        long sum = 0;

        for (short number : array) {
            sum += number;
        }

        return (short) (sum / array.length);
    }

    // Calculate the average of an integer array.
    public static int average(int[] array) {
        long sum = 0;

        for (int number : array) {
            sum += number;
        }

        return (int) (sum / array.length);
    }

    // Calculate the average of a long array.
    public static long average(long[] array) {
        long sum = 0;

        for (long number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    // Calculate the average of a double array.
    public static double average(double[] array) {
        double sum = 0;

        for (double number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    // Main method tests all four overloaded methods.
    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};

        int[] intArray = {15, 25, 35, 45};

        long[] longArray = {100, 200, 300, 400, 500};

        double[] doubleArray = {
            2.5, 4.5, 6.5, 8.5, 10.5, 12.5
        };

        System.out.println("================================");
        System.out.println("  METHOD OVERLOADING - AVERAGES");
        System.out.println("================================");

        System.out.println("\nSHORT ARRAY");
        System.out.println("Elements: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nINTEGER ARRAY");
        System.out.println("Elements: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLONG ARRAY");
        System.out.println("Elements: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDOUBLE ARRAY");
        System.out.println("Elements: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));

        System.out.println("\n================================");
        System.out.println("       PROGRAM COMPLETED");
        System.out.println("================================");
    }
}
