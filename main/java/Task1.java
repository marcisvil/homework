public class Task1 {

    public static void main(String[] args) {

        boolean doYouLikeCats = true;
        boolean doYouLikeDogs = true;

        if (doYouLikeCats) {
            if (doYouLikeDogs)
                System.out.println("You like all animals");
            else {
                System.out.println("You like only cats");
            }


        } else {
            if (doYouLikeDogs)
                System.out.println("You like only dogs");
            else {
                System.out.println("You like no animals");
            }
        }

    }
}
