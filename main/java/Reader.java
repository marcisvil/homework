import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {

        while(true){
        Scanner scanner = new Scanner(System.in);
        String info = "";

        System.out.println("Please give me person's name ");
        info = scanner.next();
        char a = '@';

            if(info.charAt(0) == a)
            {
                System.out.println(a);
                break;
            }
        char lastLetter;
        lastLetter = info.charAt(info.length() - 1);

        if (lastLetter == 's') {
            System.out.println(info + " is a man's name");
        } else {System.out.println(info + " is a woman's name");

        }

        }

        // info.length()


    }
}
