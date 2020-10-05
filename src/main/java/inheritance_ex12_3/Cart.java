package inheritance_ex12_3;

public class Cart {
    public static void main(String[] args) {

        // declare and instantiate a Shirt object using an Item reference type
        Item newShirItem = new Shirt("Green shirt", 20.10, 'L', 'G');

        // call the display method on the object, then the getColor method
        newShirItem.display();

        if (newShirItem instanceof Shirt) {
            String colorName = ((Shirt) newShirItem).getColorName('G');
            System.out.println(colorName);
        } else {
            System.out.println("The shirt item is not an instance of Shirt.");
        }
    }
}
