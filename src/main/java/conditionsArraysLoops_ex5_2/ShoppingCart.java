/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionsArraysLoops_ex5_2;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Jack Down";
        
        // array
        String[] names = {"shirt", "trousers", "shoes", "hat"};

        int quantity = names.length;
        // double price;
        // price = 150.59;

        String message = custName + " would like to purchase " + quantity + " items";
        System.out.println(message);
        System.out.println(names[2]);
    }
}
