/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionsArraysLoops_ex_5_1;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // string fields
        String custName = "Jack Down", itemDesc = "plain white shirt";

        // numeric field
        int quantity = 3;
        double price, total;
        price = 150.59;
        // boolean field
        boolean outOfStock = true;

        if (quantity > 1) {
            itemDesc = "plain white shirts";
        }

        String message = custName + " would like to purchase " + quantity + " " + itemDesc;
        total = price * quantity;

        if (outOfStock) {
            System.out.println("Sorry, but we do not currently have any stock.");
        } else {
            System.out.println(message);
            System.out.println("It will cost : " + total);
        }
    }
}
