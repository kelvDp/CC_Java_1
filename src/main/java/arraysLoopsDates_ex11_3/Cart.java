package arraysLoopsDates_ex11_3;

public class Cart {

    Item[] items = { new Item("Shirt", 25.60), new Item("Pants", 14.90), new Item("Tie", 10.00) };

    public void displayTotal() {

        double total = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i].isBackOrdered()) {
                continue;
            } else {
                total += items[i].getPrice();
            }
        }
        System.out.println("Your total will be : " + total + "$");
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.displayTotal();
    }
}
