public class loop2 {

    public static void main(String[] args) {

        boolean only = true;

        for (int i = 2; i < 21; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < 21; j++)
                if (i % j == 0) {
                    if (only == true) {
                        System.out.print(" " + j);
                        only = false;
                    } else {

                        System.out.print(", " + j);
                    }

                }

            only = true;
            System.out.println();
        }
    }
}
