package _8_oop;

public class ChildClassWithConstructor extends ParentClassWithConstructor {
    static {
        System.out.println("Object static initialization block called in ParentClass");
    }

    {
        System.out.println("Object initialization block called in ParentClass");
    }

    public ChildClassWithConstructor() {
        System.out.println("ChildClassWithConstructor called in ParentClass");
    }

    public static void staticMethod() {
        System.out.println("staticMethod() called in ChildClass");
    }
}
