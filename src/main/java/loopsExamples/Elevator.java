package loopsExamples;

public class Elevator {

    // here is an example of a while loop
    public int currentFloor = 1;

    public void changeFloor(int targetFloor) {

        while (currentFloor != targetFloor) {
            if (currentFloor < targetFloor) {
                // goUp();
            } else {
                // goDown();
            }
        }
    }

    // example of a standard for loop that repeats a block of code for a set nr of times
    public void someLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }

    // enhanced for loop --- runs through an array
    public void enhancedLoop() {
        String[] names = {"Jack", "Jill", "Bill"};

        for (String name : names) {
            System.out.println(name);
        }
    }

    // a do while loop will do something once, then check a condition to see wether to do again or not
    public void doWLoop() {

        int num1 = 1;
        int num2 = 2;

        do {
            num1 += num2;
        } while (num1 < 10);

        // so will do calc, then check if num1 is less than 10, if yes, will do again
    }

    // can nest loops inside of eachother
    public void nestedIfLoop() {
        int height = 4, width = 10;

        // now lets say you want to print a table with 4 rows and 10 columns
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("@"); // -- print does not print a new line.
            }
            System.out.println();
        }
    }

    public void nestedWhileLoop() {
        String name = "Lenny";
        String guess = "";
        int attempts = 0;

        while (!guess.equalsIgnoreCase(name)) {
            guess = "";
            while (guess.length() < name.length()) {
                char asciiChar = (char) (Math.random() * 26 + 97);
                guess += asciiChar;
            }
            attempts++;
        }
        System.out.println(name + " found after " + attempts + " tries!");
    }
}
