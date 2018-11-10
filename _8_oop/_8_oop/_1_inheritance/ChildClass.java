package _8_oop._1_inheritance;

public class ChildClass extends ParentClass {
    protected static int staticIntField;
    protected int parentIntField;
    protected int childIntField;

    public static int getStaticIntField() {
        return staticIntField;
    }

    public static void setStaticIntField(int staticIntField) {
        ChildClass.staticIntField = staticIntField;
    }

    public static void main(String[] args) {
        System.out.println("main() call from ChildClass");
    }

    public int getChildIntField() {
        return childIntField;
    }

    public void setChildIntField(int childIntField) {
        this.childIntField = childIntField;
    }

    @Override
    public int getParentIntField() {
        return parentIntField;
    }

    @Override
    public void setParentIntField(int parentIntField) {
        this.parentIntField = parentIntField;
    }
}
