package _3_operators;

public class _2_Instanceof {
	public static void main(String[] args) {
		Number number = 3;
		Integer integer = 3;
		int integer2 = 3;
		System.out.println("integer instanceof Integer: " + (integer instanceof Integer));
		System.out.println("integer instanceof Number: " + (integer instanceof Number));
		//System.out.println("integer instanceof Number: " + (integer instanceof String));
		System.out.println("integer2 instanceof Number: " + ((Integer) integer2 instanceof Number));
	}
}
