package inheritance_ex12_3;

public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(String desc, double price, char size, char colorCode) {
        super(desc, price);
        this.size = size;
        this.colorCode = colorCode;
    }

    public void display() {
        super.display();
        System.out.println("\tSize: " + size);
        System.out.println("\tColor Code: " + colorCode);
    }

    // Code a public getColor method that converts the colorCode to a the color name
    // Use a switch statement. Return the color name.

    public String getColorName(char c) {
        String colorName;
        switch (c) {
            case 'R':
                colorName = "Red";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'B':
                colorName = "Blue";
                break;
            default:
                colorName = "Undefined";
                break;
        }
        return colorName;
    }
}
