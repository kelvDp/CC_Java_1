package interfaces_ex13_1;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {

    public static void main(String[] args) {

        String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // Convert the days array into an ArrayList

        // List<String> newList = Arrays.asList(daysOfWeek);
        // ArrayList<String> newArr = new ArrayList<>(newList);

        // shorter way
        ArrayList<String> newArr = new ArrayList<>(Arrays.asList(daysOfWeek));

        // Loop through the ArrayList, printing out "sunday" elements in
        // upper case (use toUpperCase() method of String class)
        // Print all other days in lower case

        for (String day : newArr) {
            if (day.equalsIgnoreCase("sunday")) {
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day.toLowerCase());
            }
        }

        // // Print out the ArrayList
        System.out.println(newArr);
    }
}
