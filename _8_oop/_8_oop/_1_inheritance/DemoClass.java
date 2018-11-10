package _8_oop._1_inheritance;

public class DemoClass {
    public static void main(String[] args) {
        ParentClass parentClass = new ChildClass();
        // Modify ParentClass and ChildClass to check which method will be called
        parentClass.setParentIntField(1);
        ((ChildClass) parentClass).setChildIntField(1);

        int parentIntField = parentClass.getParentIntField();
        int childIntField = ((ChildClass) parentClass).getChildIntField();
        
        System.out.println("childIntField = " + childIntField);
        System.out.println("parentIntField = " + parentIntField);

        // check which method/field will be accessed staticIntField using
        // 1) instance reference (concrete object),
        // 2) Class object

        // Try to change access modifier to public/private, check the difference
        // in values (if any)
    }
}
