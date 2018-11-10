package _8_oop;

public class ParentClassWithConstructor {
    static {
        System.out.println("Object static initialization block called in ParentClass");
    }

    {
        System.out.println("Object initialization block called in ParentClass");
    }

    public ParentClassWithConstructor() {
        System.out.println("ParentClassWithConstructor called in ParentClass");
    }

    public static void staticMethod() {
        System.out.println("staticMethod() called in ParentClass");
    }
}
