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
public class ShoppingCart {
    public static void main(String[] args) {
        
        Item item1 = new Item();
        
        // 3 arg method
        item1.setItemFields("A shirt", 15.40, 3);
        item1.displayItems();
        
        // 4 arg method
        item1.setItemFields("A hat", 10.20, 1, 'P');
        item1.displayItems();
    }
}
