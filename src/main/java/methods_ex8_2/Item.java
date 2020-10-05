/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_ex8_2;

/**
 *
 * @author kelvd
 */
public class Item {

    String desc;
    double price;
    int quantity;
    char colorCode = 'U';

    public void displayItems() {
        System.out.println("Item : " + desc + ", Price : " + price + ", Quantity : " + quantity + ", color code : "
                + colorCode);
    }
    
    public void setItemFields(String description, double price, int quantity){
        this.desc = description;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int setItemFields(String desc, double price, int qty, char color){
        if (color != ' '){
            colorCode = color;
            setItemFields(desc, price, qty);
            return 1;
        } else return -1;
    }
}
