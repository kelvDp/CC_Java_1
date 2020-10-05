/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulateFormat_ex7_2;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {
    public static void main(String[] args) {
        
        String custName = "Kelvin Delport";
        String firstName;
        int spaceIndex;
        
        // StringBuilder :
        StringBuilder newString;
        
        spaceIndex = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIndex);
        System.out.println(firstName);
        
        // Instantiate and init newString to firstName
        newString = new StringBuilder(firstName);
        
        //Put the full name back together using .append 
        
        String lastName = custName.substring(spaceIndex);
        newString.append(lastName);
        
        System.out.println(newString);
        
    }
}
