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
public class Shirt {
    
    public String description;
    public char colorCode;
    public double price;
    
    // constructor
    public Shirt(String desc, String color, double price){
        this.description = desc;
        this.price = price;
        setColor(color);
    }
    
    public void setColor(String theColor){
        if (theColor.length() > 1){
            colorCode = theColor.charAt(0);
        }
    }
}
