package _3_operators.exercises;

import java.util.Scanner;

public class _1_task {
	public static void main(String[] args) {
		// Create a program that will verify whether supplied float is
		// between 0 and 1, or not.
		// Data must be read from console input.


		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the floating point number: ");
		float number = scanner.nextFloat();
		boolean isBetween = number > 0 && number < 1;
		System.out.println("Number " + (isBetween ? "is" : "is not") + " between 0 and 1");

	}
}
