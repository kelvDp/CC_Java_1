package conditions_ex10_3;

public class Discount {

    final static String NONPROFIT = "n";
    final static String PRIVATE = "p";
    final static String CORPORATE = "c";

    public static double discount;

    public static void calcDiscount(String org, double earnings) {

        switch (org) {
            case "NONPROFIT":
                discount = (earnings > 900 ? 9 : 8);
                break;
            case "PRIVATE":
                discount = (earnings > 900 ? 7 : 0);
                break;
            case "CORPORATE":
                discount = (earnings > 500 ? 8 : 5);
                break;
            default:
                discount = 0;
        }
    }

    public static void message(){
        System.out.println("You qualify for a " + discount + "% discount.");
    }

    public static void main(String[] args) {
        calcDiscount("NONPROFIT", 500.25);
        message();
    }
}
