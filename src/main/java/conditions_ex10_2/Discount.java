package conditions_ex10_2;

public class Discount {

    public static void calcDiscount(String org, double earnings) {

        if (org.equalsIgnoreCase("nonprofit") && earnings > 900) {
            System.out.println("You get a 10% discount");
        } else if (org.equalsIgnoreCase("nonprofit") && earnings < 900) {
            System.out.println("You get a 8% discount");
        } else if (org.equalsIgnoreCase("private") && earnings > 900) {
            System.out.println("You get a 7% discount");
        } else if (org.equalsIgnoreCase("private") && earnings < 900) {
            System.out.println("Sorry but you don't get a discount...");
        } else if (org.equalsIgnoreCase("corporate") && earnings > 500) {
            System.out.println("You get a discount of 8%");
        } else if (org.equalsIgnoreCase("corporate") && earnings < 500) {
            System.out.println("You get a 5% discount");
        }
    }

    public static void main(String[] args) {
        calcDiscount("nonproFit", 750.25);
    }
}
