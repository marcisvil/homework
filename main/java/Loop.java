import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        //for
        //foreach
        //do-while
        //while


        Scanner scanner = new Scanner(System.in);
        String info = "";

        int number = 0;
        while(true)
        {
            System.out.println(number);
            number++;
            if(number > 10)
            {
                break;
            }
        }
    }
}
