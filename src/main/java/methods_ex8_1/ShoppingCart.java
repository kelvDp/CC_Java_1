/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_ex8_1;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
        //   message.
        
        if (item1.setColor('U')) {
            System.out.println("Item 1's color code is : " + item1.color);
        } else {
            System.out.println("Invalid color code!");
        }

       // Test the class, using both valid and invalid colors.
       
       // valid colorCode
       item1.setColor('B');
        System.out.println(item1.color);
        
        // invalid colorCode
       item1.setColor(' ');
       System.out.println(item1.color);
    }
}
