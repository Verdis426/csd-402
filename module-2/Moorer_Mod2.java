
/*
 * Name: Verdis Moorer
 * Course: CSD-402 Java Programming
 * Assignment: Module 2 - Nested For Loops
 * Description: This program uses nested for loops
 * to display a pyramid of powers of two.
 * Each row ends with the @ symbol.
 */

public class Moorer_Mod2 {

    public static void main(String[] args) {

        // Loop through the seven rows
        for (int row = 0; row < 7; row++) {

            // Add spaces to align the pyramid
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("   ");
            }

            // Display ascending powers of two
            int number = 1;
            for (int col = 0; col <= row; col++) {
                System.out.printf("%-3d", number);
                number *= 2;
            }

            // Display descending powers of two
            number /= 4;
            for (int col = row - 1; col >= 0; col--) {
                System.out.printf("%-3d", number);
                number /= 2;
            }

            // Display @ at the end of each row
            System.out.println("@");
        }
    }
}
