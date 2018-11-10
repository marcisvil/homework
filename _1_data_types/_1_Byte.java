package _1_data_types;

public class _1_Byte {
	public static void main(String[] args) {
		System.out.println("Byte can hold 1 byte (8 bits) and its values are from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		byte byte1 = 1;
		byte byte2 = 10;
		byte byte3 = 127;
		byte byte4 = (byte) (byte3 + 1 + 1);
		byte byte5 = 8 / 3;


		System.out.println();
		System.out.println("byte1 = " + byte1);
		System.out.println("byte2 = " + byte2);
		System.out.println("byte3 = " + byte3);
		System.out.println("byte4 = " + byte4);
		System.out.println("byte5 = " + byte5);
	}
}
