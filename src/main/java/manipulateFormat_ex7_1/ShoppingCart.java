/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulateFormat_ex7_1;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {
    public static void main(String[] args) {
        
        String custName = "Gerald Green";
        String firstName;
        int spaceIndex;
        
        spaceIndex = custName.indexOf(" ");
        
        // substring method first arg is where to start, and second arg is where to cut off.
        firstName = custName.substring(0, spaceIndex);
        System.out.println(firstName);
        
        String lastName = custName.substring(spaceIndex).trim();
        System.out.println(lastName);
    }
}
