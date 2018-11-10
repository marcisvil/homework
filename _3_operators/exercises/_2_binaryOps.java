package _3_operators.exercises;

public class _2_binaryOps {
	public static void main(String[] args) {
		// Create a program that will take number 170 (10101010 in binary)
		// and make all possible binary operations with number 85 (01010101 in binary).

		System.out.println("170 AND 85: " + (170 & 85));
		System.out.println("170 OR 85: " + (170 | 85));
		System.out.println("170 XOR 85: " + (170 ^ 85));
		System.out.println("NOT 170: " + (~170));
	}
}
