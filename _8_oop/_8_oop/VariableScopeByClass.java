package _8_oop;

public class VariableScopeByClass {
    private static int intVariable = 0;
    private static VariableScopeByClass classReferenceField = new VariableScopeByClass();

    static {
        // Class static initialization block
        // Will be called once when class loaded
        classReferenceField.intVariable = 20;
    }

    {
        // Class initialization block
        // Will be called once per object instantiation
        // just before constructor
        classReferenceField.intVariable = 20;
    }

    public static void main(String[] args) {
        classReferenceField.intVariable = 1;
        {
            classReferenceField.intVariable = 10;
        }
        VariableScopeByClass vs = new VariableScopeByClass();
        // Which variable will be changed?
        // classReferenceField.intVariable++;
        // vs.classReferenceField.intVariable = 2;
        // this.classReferenceField.intVariable = 3;
        // VariableScopeByClass.classReferenceField.intVariable = 3;

    }
}
