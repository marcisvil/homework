import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some text");
        String word = "";
        word = scanner.next();
        System.out.println("The same text in reverse:");


        char[] letters = word.toCharArray();
        for (int i = (word.length() - 1); i >= 0; i--) {
            System.out.print(letters[i]);

        }


    }
}
