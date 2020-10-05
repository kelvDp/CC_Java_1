package arrayListsPractice;

import java.util.ArrayList;

import inheritanceExamples.Shirt;

public class Main {
    // can create an array list without specifying obj type
    // but this will produce warnings
    // ArrayList firstList = new ArrayList();

    // array list with obj type
    ArrayList<String> secondArr = new ArrayList<String>();

    // an array list can contain any object type, including a type that you have created yourself with a class
    ArrayList<Shirt> myList;


    // Working with an array list:

    void createList(){
        ArrayList<String> names = new ArrayList<String>();

        // how to add items to the array list
        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");

        // how to remove from the array list
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Gustav");

        System.out.println(names);  // can simply print without looping through the array list.

    }
}
