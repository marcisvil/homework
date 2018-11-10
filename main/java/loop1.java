public class loop1 {

    public static void main(String[] args) {

        boolean first = true;
        for (int i = 2; i < 21; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < 21; j++) {
                if (i % j == 0){
                    if (first == true) {
                        System.out.print(j);
                        first = false;
                    }else {
                        System.out.print(", " + j);
                    }
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            first = true;
        }


    }

}