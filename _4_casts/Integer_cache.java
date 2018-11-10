package _4_casts;

public class Integer_cache {
	public static void main(String[] args) {
		Integer int1 = 127;
		Integer int2 = 127;
		System.out.println("(int1 == int2) = " + (int1 == int2));
		System.out.println("(int1 == int2) = " + (int1.equals(int2)));

		// Only -128 - 127 values are cached by default, hence are available for
		// comparison using == operator. It is not a good practice to check
		// object equality using that method, use .equals whenever possible.
		Integer int3 = 128;
		Integer int4 = 128;
		System.out.println("(int3 == int4) = " + (int3 == int4));
		System.out.println("(int3 == int4) = " + (int3.equals(int4)));

		// You can set JVM startup parameter to override this behavior
		// Again, it is rarely used in real-world applications, but since it
		// is part of the JVM architecture it is worth mentioning that.
		// JVM parameter: -XX:AutoBoxCacheMax
	}
}
