package _8_oop;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        // Which method will be called?
        // Is it possible to force one or another
        // method call using different cast?
        mo.callMe('A');
        mo.callMe(Integer.MAX_VALUE);
        mo.callMe(Short.MAX_VALUE);
        mo.callMe(32767); //Short.MAX_VALUE value
        mo.callMe(Long.MAX_VALUE);
    }

    private void callMe(char param) {
        System.out.println("callMe(char) called");
    }

    private void callMe(short param) {
        System.out.println("callMe(short) called");
    }

    private void callMe(int param) {
        System.out.println("callMe(int) called");
    }

    private void callMe(double param) {
        System.out.println("callMe(double) called");
    }
}
