/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettingStarted_ex2;

/**
 *
 * @author kelvd
 */
public class Try {
    public static void main(String[] args) {
//        String greeting = " HOW ".trim();
//        String lc = greeting + "DY".toLowerCase();
//        System.out.println(lc);

          String phoneNum = "012-345-6789";
          // looks for the first occurence of a dash.
          int index1 = phoneNum.indexOf("-");
          System.out.println("The first index of the dash is : " + index1);
          
          // looks for the second occurence of the dash, so second arg says to look after the first occurence.
          int index2 = phoneNum.indexOf("-", index1+1);
          System.out.println("The second index of the dash is : " + index2);
          
          // with stringbuilders you have to use .append .... can only use .concat on a normal string
          StringBuilder myString = new StringBuilder("Hello");
          myString.append(" World");
          System.out.println(myString);
          
          //normal string 
          String normalString = "Hello";
          String normString2 = normalString.concat(" WOrld");
          System.out.println(normString2);
          
          // a char is a string but can only contain one letter, and must be in single quotes
        //   char item = 'U';
          
          // how to creAate a constant
        //   final int salesTax = 5;
          
          // will increment both id and newId
          // -- 7 and 7
          int id = 6;
          int newId = ++id;
          System.out.println("first id : " + id + " new id : " + newId);
          
          // will only increment the secondId and not anotherId for some reason
          // 7 and 6
          int secondId = 6;
          int anotherId = secondId++;
          System.out.println("second id : " + secondId + " another id : " + anotherId);
          
          // with pre and post increment think about printing the values
          // if post increment, it will print the current count before incrementing
          // so if printing the next count it will be incremented
          // with pre increment, it will increment the currentvalue before  printig
          // so will see incremented value directly
          int count = 15;
          int a, b, c, d;
          a = count++;
          System.out.println(a);
          b = count;
          System.out.println(b);
          c = ++count;
          System.out.println(c);
          d = count;
          System.out.println(d);
          
          // here it will also promote the int to a long when you run it.
          int num1 = 55555;
          long num2 = 66666;
          long num3 = num1 * num2;
          System.out.println(num3);
          
          // how to cast down to a lower datatype
        //   int a1 = 53;
        //   int a2 = 48;
        //   byte a3;
        //   a3 = (byte)(a1 + a2);
          
          int ageYears = 32;
          int ageDays = ageYears * 365;
          
          // have to make one value in here a long to tell compiler that its a long
          long ageSeconds = ageYears * 365 * 24L * 60 * 60;
          
          System.out.println("You are " + ageDays+ " days old");
          System.out.println("You are " + ageSeconds + " seconds old");
    }
}
