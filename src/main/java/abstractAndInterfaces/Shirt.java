package abstractAndInterfaces;

// you can extend a parentclass and implement a returnable at the same time
public class Shirt extends Clothing implements Returnable {
    
    private char size;

    public Shirt(String desc, double price, char color, char size) {
        super(desc, price, color);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

   public String doReturn() {
       return "Suit returns must be within 3 days";
   }


   // in the main class you can refernece the shirt object in three ways
   // Clothing newShirt = new Shirt(...);
   // Shirt newShirt = new Shirt(...);
   // Returnable newShirt = new Shirt(...);

   // in the case of casting an instance, you do it the same way as before
   // ((Shirt) newShirt).method();
}
