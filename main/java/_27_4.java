import java.util.Scanner;

public class _27_4 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double numb = 50;
        double dif = 50;

        String answ;

        for (int i = 0; i < 7; i++) {
            System.out.println("Is your number larger than " + numb);
            answ = scanner.next();
            dif = dif / 2;


            if (dif < 3 && dif > 1) {
                dif = Math.round(dif);
            } else {
                dif = Math.floor(dif);
            }


            if (dif < 1 && numb > 50) {
                if (answ.equals("y")) {
                    numb = numb + 1;
                }
                if (answ.equals("n")) {
                    numb = numb - dif;
                    break;
                }

            }
            if (dif < 1 && numb < 50) {
                if (answ.equals("y")) {
                    numb = numb + 1;

                }
                if (answ.equals("n")) {
                    numb = numb - dif;
                    break;
                }

            }
            if (answ.equals("y")) {
                numb = numb + dif;
            }
            if (answ.equals("n")) {
                numb = numb - dif;
            }

        }
        System.out.println("your number must be : " + numb);
    }
}
