public class loop12 {

    public static void main(String[] args) {

        boolean first = true;
        for (int i = 1; i < 20; i++) {

            if (i == 1) {
                System.out.print("    |");
                for (int j = 2; j < 21; j++) {
                    System.out.print("-" + (j >= 10 ? (j + " |") : (" " + j) + "-|"));


                    ;


                }
                System.out.println();
                System.out.print(" 2: |");


            } else if (i > 1 && i < 9) {
                System.out.print(" " + (i+2) + ": |");
            } else {
                System.out.print((i+2) + ": |");
            }


            for (int j = 1; j < 20; j++) {

                if (i % j == 0) {
                    if (j == 1) {
                        System.out.print("-XX-|");
                        first = false;
                    } else {
                        System.out.print("-XX-|");
                    }
                } else {
                    System.out.print("-  -|");
                }
            }
            System.out.println();
            first = true;
        }


    }

}