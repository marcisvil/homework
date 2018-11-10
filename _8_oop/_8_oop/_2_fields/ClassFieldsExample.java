package _8_oop._2_fields;

public class ClassFieldsExample {
    private static int staticIntField = 1;
    private int nonStaticIntField = 2;

    public static void main(String[] args) {
        ClassFieldsExample cfe = new ClassFieldsExample();
        System.out.println("cfe.nonStaticIntField = " + cfe.nonStaticIntField);
        System.out.println("ClassFieldsExample.staticIntField = " + ClassFieldsExample.staticIntField);

        // Create method to set both, static and non-static fields on created instance
        // (add this method to this class). What kind of access is required for this method?
        // Is it possible to do so using class object?
    }
}
