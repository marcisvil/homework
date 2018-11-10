package _2_variables;

public class Variables {
	public static Integer integer3 = 0;
	public static String string = "My data";
	

	public static void main(String[] args) {
		int integer1 = 65;
		char char1 = 65;
		short short1 = 65;
		long long1 = 65;
		double double1 = 65;
		float float1 = 65;

		Integer ii;

		//System.out.println("integer1 is equal with integer2: " + (integer1 == integer2));
		//System.out.println("integer3: " + integer3);
		//System.out.println("string: '" + integer3 + "'");


		//integer1=char1;
		//integer1=short1;
		byte b = (byte) short1;
		System.out.println("b = " + b);
		//integer1= (int) long1;

		//integer1=double1;
		//integer1=float1;

//double1 = float1;       char1=float1;    short1 = float1;        float1=float1;
//double1 = char1;        char1=char1;     short1 = char1;         float1=char1;
//double1 = short1;       char1=short1;    /*short1 = short1;*/    float1=short1;
//double1 = long1;        char1=long1;     short1 = long1;         float1=long1;
///*double1 = double1;*/  char1=double1;   short1 = double1;       /*float1=double1; */
//double1 = float1;       char1=float1;    short1 = float1;        float1=float1;
	}
}
