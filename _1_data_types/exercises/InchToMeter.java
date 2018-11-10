package _1_data_types.exercises;

import java.util.Scanner;

public class InchToMeter {
	public static void main(String[] args) {
		// Create a program that will convert inches to meters.
		// Data must be read from console input.
		//
		// Hints and examples:
		// Initiate console reader:         new Scanner(System.in)
		// Read number from console:        Scanner.nextInt()
		// 1 inch = 0.0254 meters
		// 10in   = 0.254 m
		// 100in   = 22.54 m

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter inches: ");
		String str = scanner.next();
		int inches = Integer.parseInt(str);
		float meters = inches * 0.0245F;
		
		System.out.println("Inches: " + inches + ", Meters: " + meters);
	}
}
