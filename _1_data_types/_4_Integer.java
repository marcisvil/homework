package _1_data_types;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _4_Integer {
	public static void main(String[] args) {
		System.out.println("Integer can hold 4 bytes (32 bits) and its values are from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		int int1 = 5;
		int int2 = 3;
		byte byte1 = 127;
		byte byte2 = 127;
		byte byte3 = (byte) (byte1 + byte2);
		int int3 = byte1 + byte2;
		int int4 = byte1 / byte2;
		int int5 = int1 / int2;
		int int6 = Integer.MAX_VALUE;
		int int7 = int6 + 1;

		System.out.println();
		System.out.println("int1 = " + int1);
		System.out.println("int2 = " + int2);
		System.out.println("byte1 = " + byte1);
		System.out.println("byte2 = " + byte2);
		System.out.println("byte3 = " + byte3);
		System.out.println("int3 = " + int3);
		System.out.println("int4 = " + int4);
		System.out.println("int5 = " + int5);
		System.out.println("int6 = " + int6);
		System.out.println("int7 = " + int7);

		int int8 = Integer.MAX_VALUE * Integer.MAX_VALUE;
		System.out.println("int8 = " + int8);

		//// Actual binary representation of int8 result - only last 32 significant bits will be used in
		//// resulting Integer, hence rendering number 1 as a result.
		//BigDecimal bigDecimal = new BigDecimal(Integer.MAX_VALUE);
		//bigDecimal = bigDecimal.multiply(new BigDecimal(Integer.MAX_VALUE));
		//System.out.println("decToBin(Integer.MAX_VALUE * Integer.MAX_VALUE) = " + decToBin(bigDecimal));
	}


	/**
	 * Support method to print binary number representation
	 * 
	 * @param bigDecimal Number to be printed
	 * @return String containing 0's and 1's character sequence as binary param representation.
	 */
	public static String decToBin(BigDecimal bigDecimal) {
		String result ="";

		BigDecimal copy = bigDecimal;
		final BigDecimal zero = new BigDecimal(0);
		while (zero.compareTo(copy) < 0) {

			BigDecimal rem = copy.remainder(new BigDecimal(2));
			result = rem.intValue() + result;
			copy = copy.divide(new BigDecimal(2), RoundingMode.DOWN);
		}

		return result;
	}
}
