package inheritance_ex12_2;

public class Shirt extends Item {
    
    private char size;
    private char colorCode;

    public Shirt(String desc, double price, char size, char colorCode) {
        super(desc, price);
        this.size = size;
        this.colorCode = colorCode;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public void display(){
        // System.out.println("Item description: "+getDesc());
        // System.out.println("\tID: "+getId());
        // System.out.println("\tPrice: "+getPrice());

        // instead of repeating the code from the parent class, just call the parent method here:
        super.display();  // -- now will display parent code first
        System.out.println("\tSize: "+getSize());
        System.out.println("\tColor code: "+getColorCode());
    }
    
}
