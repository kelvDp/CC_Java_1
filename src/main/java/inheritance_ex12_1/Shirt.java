package inheritance_ex12_1;

public class Shirt extends Item {

    private char gender;
    private char size;

    public Shirt(String desc, double price, char gender, char size) {
        super(desc, price);
        this.gender = gender;
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    
}