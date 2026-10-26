
import java.util.Scanner;

/*
 * Author: Verdis Moorer
 * Course: CSD-402
 * Assignment: Module 1 - Water Heating
 * Description: Calculates the energy required
 * to heat water using mass and temperature.
 */

public class WaterHeating {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter water amount in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy in Joules
        double energy = waterMass *
                (finalTemperature - initialTemperature) * 4184;

        System.out.printf(
                "The energy needed is %.2f Joules.%n", energy);

        input.close();
    }
}

