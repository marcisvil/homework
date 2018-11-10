public class loop2_home {

    public static void main(String[] args) {

        boolean only = true;

        for (int i = 1; i < 21; i++) {

            if (i==1) {
                System.out.print("    |");
            } else {

                if (i < 10) {
                    System.out.print(" " + i + ": |");
                } else {
                    System.out.print(i + ": |");
                }

            }
            for (int j = 2; j < 21; j++)

                if (i == 1) {
                    System.out.print("-" + (j >= 10 ? (j) : (" " + j)) + "-|");
                } else if (i % j == 0) {
                    if (only == true) {
                        System.out.print("-XX-|");
                        only = false;
                    } else {

                        System.out.print("-XX-|");
                    }

                } else {
                    System.out.print("-  -|");
                }

            only = true;
            System.out.println();
        }
    }
}
