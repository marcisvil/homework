package _1_data_types;

public class _3_Character {
	public static void main(String[] args) {
		//System.out.println("Character can hold 2 bytes (16 bits) and its values are from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
		System.out.println("Character can hold 2 bytes (16 bits) and its values are from " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
		char char1 = 'f';
		char char2 = 'ñ';
		char char3 = '™';
		char char4 = 65;
		char char5 = (char) (char4 + 1);

		System.out.println();
		System.out.println("char1 = " + char1);
		System.out.println("char2 = " + char2);
		System.out.println("char3 = " + char3);
		System.out.println("char4 = " + char4);
		System.out.println("char5 = " + char5);

		//// Rich UTF-16 support example - printing surrogate pairs for emoji icons
		//for (int codePoint = 0x1F600; codePoint <= 0x1F64F; ) {
		//	System.out.print(Character.toChars(codePoint));
		//	codePoint++;
		//	if (codePoint % 16 == 0) {
		//		System.out.println();
		//	}
		//}
	}
}
