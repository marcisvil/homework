import java.util.Scanner;

public class _27_3 {
    public static void main(String[] args) {

        int maxnr = 100;
        int minnr = 0;
        int numb = 50;
        int dif = 25;
        String answ;




        System.out.println("1.Is your number larger than " + numb + " ? Answer with y or n");
        while (true) {


            Scanner scanner = new Scanner(System.in);
            answ = scanner.next();

            if (answ.equals("y")) {
                numb = numb + dif;
                dif =dif/2;
                System.out.println("Is your number larger than " + numb + " ? Answer with y or n");

            }
            if (answ.equals("n")) {
                numb = numb - dif;
                dif = dif/2;
                System.out.println("Is your number larger than " + numb + " ? Answer with y or n");
            }



        }


    }

}
