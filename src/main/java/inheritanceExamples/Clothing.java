package inheritanceExamples;

public class Clothing {
    // fields givven default values

    private int itemID = 0;
    private String desc = "--desc required--";
    private char colorCode = 'U';
    private double price = 0.0;

    // Constructor
    public Clothing(int id, String desc, char color, double price) {
        this.itemID = id;
        this.desc = desc;
        this.colorCode = color;
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // will only print out fields that are in clothing class
    // so will have to override this in the subclass
    public void display() {
        System.out.println("Item ID : " + getItemID());
        System.out.println("Item description : " + getDesc());
        System.out.println("Item price : " + getPrice());
        System.out.println("Color code : " + getColorCode());
    }

    // instead of using a display method, you can override the default toString
    // method
    // of all objects --> System.out.println();

    public String toString() {
        return ("This shirt is a " + getDesc() 
            + "; it costs: " + getPrice() 
            + "; and it's color: " + getColorCode());
    }
    // so now when you call System.out.println(Clothing); for example
    // it will print the toString method.
}
