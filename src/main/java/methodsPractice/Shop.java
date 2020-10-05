/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsPractice;

/**
 *
 * @author kelvd
 */
public class Shop {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("Sailor", "Blue", 30);
        Shirt shirt2 = new Shirt("Sweatshirt", "Green", 25);
        Shirt shirt3 = new Shirt("Skull Tee", "Blue", 15);
        Shirt shirt4 = new Shirt("Tropical", "Red", 20);
        
        System.out.println(shirt1.description);
        System.out.println(shirt2.description);
        System.out.println(shirt3.description);
        System.out.println(shirt4.description);
    }
}
