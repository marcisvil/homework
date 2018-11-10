package _1_data_types;

public class _6_Float {

	public static void main(String[] args) {
		System.out.println("Float can hold 4 bytes (32 bits) and its values are from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		float float1 = 1;
		float float2 = (float) 1.1;
		float float3 = 1.1F;
		float float4 = 1 / 2F;
		float float5 = 0.1F + 0.2F;

		System.out.println();
		System.out.println("float1 = " + float1);
		System.out.println("float2 = " + float2);
		System.out.println("float3 = " + float3);
		System.out.println("float4 = " + float4);
		System.out.println("float5 = " + float5);
	}
}
