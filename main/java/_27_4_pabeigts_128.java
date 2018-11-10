import java.util.Scanner;

public class _27_4_pabeigts_128 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numb = 64;
        int dif = 64;
        String answ;

        for (int i = 0; i < 7; i++) {
            System.out.println("Is your number larger than " + numb);
            answ = scanner.next();
            dif = dif / 2;
            if (dif < 1) {
                if (answ.equals("y")) {
                    numb =numb +1;
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
                numb =numb - dif;
            }

        }
        System.out.println("your number must be : " + Math.round(numb));
    }
}