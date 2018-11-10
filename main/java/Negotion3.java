public class Negotion3 {

    public static void main(String[] args) {

        boolean doYouLikeCats = false;
        boolean doYouLikeDogs = true;

        if (doYouLikeCats && doYouLikeDogs) {

            System.out.println("You like all animals");

        }
        if (!doYouLikeCats && !doYouLikeDogs) {

            System.out.println("You like no animals");
        }
        if (doYouLikeCats) {

            System.out.println("You like dogs");
        }
        if (doYouLikeDogs) {

            System.out.println("You like cats");
        }

    }

}
