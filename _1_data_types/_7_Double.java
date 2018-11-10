package _1_data_types;

import static java.lang.Double.SIZE;

public class _7_Double {
	public static void main(String[] args) {
		System.out.println("Double can hold " + (SIZE / 8) + " bytes (" + SIZE + " bits) and its values are from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		//// Actual MIN_VALUE and MAX_VALUE representation in decimal (human-readable) format
		//System.out.println(
		//	"Double can hold " + (SIZE / 8) + " bytes (" + SIZE + " bits) and its values are from \n" +
		//	new BigDecimal(Double.MIN_VALUE).toPlainString() + "\n" +
		//	" to \n" +
		//	new BigDecimal(Double.MAX_VALUE).toPlainString()
		//);
		////
		//// Proper minimal and maximal value usage example in decimal (human-readable) format
		//System.out.println(
		//	"Double can hold " + (SIZE / 8) + " bytes (" + SIZE + " bits) and its values are from \n" +
		//	new BigDecimal(-Double.MAX_VALUE).toPlainString() + "\n" +
		//	" to \n" +
		//	new BigDecimal(Double.MAX_VALUE).toPlainString()
		//);

		double double1 = 1;
		double double2 = 2 / 3;
		double double3 = 0.1 + 0.2;

		System.out.println();
		System.out.println("double1 = " + double1);
		System.out.println("double2 = " + double2);

		// Why it is not 0.3: https://stackoverflow.com/a/27030789
		System.out.println("double3 = " + double3);
	}
}
