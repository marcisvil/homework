package _8_oop;

public class VariableScope {
    private static int intVariable = 0;

    static {
        // Class static initialization block
        // Will be called once when class loaded
        intVariable = 20;
    }

    {
        // Class initialization block
        // Will be called once per object instantiation
        // just before constructor
        intVariable = 20;
    }

    public static void main(String[] args) {
        intVariable = 1;
        {
            int intVariable = 10;
        }
        VariableScope vs = new VariableScope();
        // Which variable will be changed?
        // intVariable++;
        // vs.intVariable = 2;
        // this.intVariable = 3;
        // VariableScope.intVariable = 3;

    }
}
