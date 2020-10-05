/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables_ex4_2;

/**
 *
 * @author kelvd
 */
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Grant Black", itemDesc = "chicken sandwhich";
        String message;
//        message = custName + " wants to purchase a " + itemDesc;

        double price, tax;
        price = 15.20;
        tax = 0.14;
        int quantity = 2;

        double total;
        message = custName + " wants to purchase " + quantity + " " + itemDesc;

        double taxPrice = (price * quantity) * tax;
        total = price * quantity;

        System.out.println(message);
        System.out.println("It will cost him " + total);
        System.out.println("He is paying " + taxPrice + " tax on his order");
    }
}
