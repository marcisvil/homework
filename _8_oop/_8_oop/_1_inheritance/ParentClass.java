package _8_oop._1_inheritance;

public class ParentClass {
    protected static int staticIntField;
    protected int parentIntField;

    public static int getStaticIntField() {
        return staticIntField;
    }

    public static void setStaticIntField(int staticIntField) {
        ParentClass.staticIntField = staticIntField;
    }

    public static void main(String[] args) {
        System.out.println("main() call from ParentClass");
    }

    public int getParentIntField() {
        return parentIntField;
    }

    public void setParentIntField(int parentIntField) {
        this.parentIntField = parentIntField;
    }
}
