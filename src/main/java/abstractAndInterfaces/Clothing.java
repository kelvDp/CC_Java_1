package abstractAndInterfaces;

public class Clothing {
    
    private int id;
    private String desc;
    private double price;
    private char colorCode;
    private int nextID = 0;

    public Clothing(String desc, double price, char color) {
        setId();
        setDesc(desc);
        setPrice(price);
        setColorCode(color);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextID++;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    
}
