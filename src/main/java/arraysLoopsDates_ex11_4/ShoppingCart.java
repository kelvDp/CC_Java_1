package arraysLoopsDates_ex11_4;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {

        // Declare, instantiate, and initialize an ArrayList of Strings.Print and test
        // your code.

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Jamie");
        myList.add("Kel");
        myList.add("Tim");

        System.out.println(myList);

        // add (insert) another element at a specific index

        myList.add(1, "Aliza");

        System.out.println(myList);

        // Check for the existence of a specific String element.
        // If it exists, remove it.

        if (myList.contains("Kel")) {  // case sensitve
            myList.remove("Kel");
        }

        System.out.println(myList);
    }
}
