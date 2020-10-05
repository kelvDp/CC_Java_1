package getAndSetPractice;

public class Shirt {

    // private int shirtId = 0;
    private String desc = "-- description required --";
    private char colorCode = 'U'; // making something private makes it only accessible in the class it is stored.
    private double price = 0.0;

    // adding a constructor
    public Shirt(char colorCode, String desc, double price) {
        setColorCode(colorCode);
        setDescription(desc);
        setPrice(price);
    }

    // this is how to create a public get method which allows main class to see the
    // colorCode
    public char getColorCode() {
        return colorCode;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    // how to create a setter method. With some conditions added in
    public void setColorCode(char newCode) {
        // colorCode = newCode;

        // to make sure they enter a valid colorCode, add checks in the method here
        if (newCode == 'R') {
            colorCode = newCode;
            return;

        }
        if (newCode == 'G') {
            colorCode = newCode;
            return;  // -- have to use a return here to make sure it works.
            // void type methods can have a return statement, just not a return value.
        }
        if (newCode == 'B') {
            colorCode = newCode;
            return;
        }
        System.out.println("Invalid color code, can only choose 'R' , 'G', 'B'.");
    }

    public void setDescription(String description) {
        desc = description;
    }

    public void setPrice(double p) {
        price = p;
    }
}
