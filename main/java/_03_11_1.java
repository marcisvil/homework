public class _03_11_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i >= j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("X ");
                } else if (j == 0 || j == 4) {
                    System.out.print("X ");
                } else if (i == 4 - j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("X ");
                } else if (j == 0 || j == 4) {
                    System.out.print("X ");
                } else if (i == 4 - j||i==j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("X ");
                }  else if (i == 4 - j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4) {
                    System.out.print("X ");
                } else if (i == 4 - j) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }







    }
}
