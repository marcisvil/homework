package _5_loops;

public class _1_DivisorsOf20 {
	public static void main(String[] args) {
		// Create a program that will check and print out
		// all possible divisors for numbers 2..20
		// Data must be read from console input.
		//
		// Hints and examples:
		//  2: 2
		//  3: 3
		//  4: 2,4
		//  5: 5
		//  6: 2,3,6
		//  7: 7
		//  8: 2,4,8
		//  9: 3,9
		// 10: 2,5,10


		boolean hasPrevious = false;
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + ": ");
			hasPrevious = false;
			for (int j = 2; j <= 20; j++) {
				if (i % j == 0) {
					if (hasPrevious) {
						System.out.print("," + j);
					} else {
						hasPrevious = true;
						System.out.print(j);
					}
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}
}
