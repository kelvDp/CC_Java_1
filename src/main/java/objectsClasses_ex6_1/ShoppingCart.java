/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsClasses_ex6_1;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.description = "a description for item 1";
        item2.description = "another description for item 2";
        
        System.out.println(item1.description);
        System.out.println(item2.description);
    }
}
