import java.util.Scanner;

public class _27_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        switch (a) {
            case "1":
                System.out.println("monday");
            case "2":
                System.out.println("tuesday");
            case "monday":
                System.out.println(1);
                default:
                    System.out.println("bad input");
        }
    }
}
