import java.util.Scanner;

public class uzd2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numb;
        numb = scanner.nextInt();

        int xxx;
        int xx;
        int x;
        int sum;

        xxx = numb / 100;
        xx = (numb - xxx * 100) / 10;
        x = (numb-xxx * 100 - xx * 10);
        sum = xxx + xx + x;
        System.out.println(sum);
    }
}

