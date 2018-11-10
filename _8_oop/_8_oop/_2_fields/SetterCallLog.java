package _8_oop._2_fields;

public class SetterCallLog {
    public int setMe = 0;

    public static void main(String[] args) {
        SetterCallLog scl = new SetterCallLog();
        scl.setMe = 1;
        scl.setMe = 2;
        // Change this class in a way that all changes in setMe variable
        // are logged in console (via System.out, "old value => new value" eg. "0=>1").
        // You will need to change access type of the field and add setter method.
    }
}
