package _3_operators.exercises;

public class _3_bitShift {
	public static void main(String[] args) {
		// Create a program that will make signed left and right bit-shift,
		// as well as unsigned right bit-shift 1, 2 and 3 times for number 64 and -64

		System.out.println("64 << 1 : " + (64 << 1));
		System.out.println("64 << 2 : " + (64 << 2));
		System.out.println("64 << 3 : " + (64 << 3));
		System.out.println("64 >> 1 : " + (64 >> 1));
		System.out.println("64 >> 2 : " + (64 >> 2));
		System.out.println("64 >> 3 : " + (64 >> 3));
		System.out.println("64 >>> 1 : " + (64 >>> 1));
		System.out.println("64 >>> 2 : " + (64 >>> 2));
		System.out.println("64 >>> 3 : " + (64 >>> 3));
		System.out.println();
		System.out.println("-64 << 1 : " + (-64 << 1));
		System.out.println("-64 << 2 : " + (-64 << 2));
		System.out.println("-64 << 3 : " + (-64 << 3));
		System.out.println("-64 >> 1 : " + (-64 >> 1));
		System.out.println("-64 >> 2 : " + (-64 >> 2));
		System.out.println("-64 >> 3 : " + (-64 >> 3));
		System.out.println("-64 >>> 1 : " + (-64 >>> 1));
		System.out.println("-64 >>> 2 : " + (-64 >>> 2));
		System.out.println("-64 >>> 3 : " + (-64 >>> 3));
	}
}
