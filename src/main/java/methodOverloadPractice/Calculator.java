/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodOverloadPractice;

/**
 *
 * @author kelvd
 */
public final class Calculator {
    
    // with method overloading you can have a bunch of methods with the same name but different uses
    // and different signatures.
    public static int sum(int num1, int num2){
        System.out.println("METHOD 1");
        return num1 + num2;
    }
    
    public static float sum(float num1, float num2){
        System.out.println("METHOD TWO");
        return num1 + num2;
    }
    
    public static float sum(int num1, float num2){
        System.out.println("METHOD THREE");
        return num1 + num2;
    }
}
