package _1_data_types.exercises;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		// Create a program to convert Celsius degrees to Fahrenheit degrees.
		// Data should be pre-filled in variable.
		//
		// Hints and examples:
		// F = (°C × 9/5) + 32
		// 10°C  = 50F
		// 11°C  = 51.8F
		// 100°C = 212F

		double celsius = 11;
		double fahrenheit = celsius * 9 / 5 + 32;
		
		System.out.println("Celsius: " + celsius + ", Fahrenheit: " + fahrenheit);
	}
}
