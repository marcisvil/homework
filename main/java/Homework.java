import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String info = "";
        int a = 0;
        int b;
        char end = '@';

        System.out.println("Give me list of numbers, press ENTER after each number. Insert - @, to find the largest from inserted number");
        while (true) {


            info = scanner.next();

            if (info.charAt(0) == end) {
                System.out.println("Biggest number is " + a);
                break;
            }
            b = Integer.parseInt(info);


            if (b > a) {
                a = b;

            }


        }
    }
}
