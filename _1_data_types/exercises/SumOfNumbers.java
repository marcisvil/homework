package _1_data_types.exercises;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		// Create a program that will sum all digits in an entered number.
		// Numbers should be in 0..999 range.
		// Data must be read from console input.
		//
		// Hints and examples:
		// Remember, that number 123 is 1*100 + 2*10 + 3
		// Initiate console reader:         new Scanner(System.in)
		// Read number from console:        Scanner.nextInt()
		// 123 = 6
		// 111 = 3
		//  12 = 3

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number = scanner.nextInt();


		//// Fastest way - get all digits and sum them up
		//String numberString = "" + number;
		//int result = 0;
		//for (int i = 0; i < numberString.length(); i++) {
		//	result += Integer.parseInt("" + numberString.toCharArray()[i]);
		//}


		//// Split digits by index (1/10/100) and then sum them up
		int firstDigit = (number - number % 100) / 100;
		int secondDigit = (number - firstDigit * 100) / 10;
		int thirdDigit = (number - firstDigit * 100 - secondDigit * 10);
		int result = firstDigit + secondDigit + thirdDigit;

		//// Recursion-like approach
		//int remainingNumber;
		//int firstDigit = number % 10;
		//remainingNumber = number / 10;
		//int secondDigit = remainingNumber % 10;
		//remainingNumber = remainingNumber / 10;
		//int thirdDigit = remainingNumber % 10;
		//int result = firstDigit + secondDigit + thirdDigit;
		
		System.out.println("Number " + number + " sum of digits is: " + result);
	}
}
