package _3_operators;

public class _1_Assignment {
	public static void main(String[] args) {
		int integer = 1 + 2 * 3 - 4 * 5;
		//System.out.println("integer = " + integer);
		int variable = 5;
		                 // 6            // 7
		int prefixSum = ++variable + ++variable;
		//System.out.println("prefixSum = " + prefixSum);

		variable = 5;       // 5          // 6
		int postfixSum = variable++ + variable++;
		System.out.println("postfixSum " + postfixSum);
	}
}
