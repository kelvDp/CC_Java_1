package arraysLoopsDates_ex11_3;

public class Item {

    private String desc;
    private double price;
    private boolean isBackOrdered;
    private int id;
    private static int nextId = 1;

    public Item(String desc, double price) {
        setDesc(desc);
        setPrice(price);
        setId();
        checkStock();
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    private void setId() {
        this.id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public boolean isBackOrdered() {
        return isBackOrdered;
    }

    private void checkStock() {
        double num = Math.random() * 1000;
        if ((int) (num) % 2 == 1) {
            this.isBackOrdered = true;
            System.out.println(getDesc() + " is out of stock.");
        } else {
            this.isBackOrdered();
        }
    }
}
