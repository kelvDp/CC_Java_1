package conditionsNotes;

public class Employees {

    // when comparing string to string you can't really use the == operator
    // since it will then look to see if the strings share the same place in memory
    // so have to use the .equal method with strings

    public String name1 = "Fred Smith";
    public String name2 = "Sam Smith";

    public void areNamesEqual() {
        if (name1.equals(name2)) {
            System.out.println("Same name");
        } else {
            System.out.println("Different name");
        }
    }

    // there is a method to also check for equality without being case sensitive

    public String name3 = "Fred Smith";
    public String name4 = "fred smith";

    public void isNameEqual() {
        if (name3.equalsIgnoreCase(name4)) {
            System.out.println("Same name");
        } else {
            System.out.println("Different name");
        }
    }

    // example of a ternary operator
    // public int z = ((x / y) ? x : y);

    // Switch statements are just like if and else statements , only a bit more
    // readable
    public void switchCase(int month) {
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            default :
                System.out.println("This can go on and on...");
        }
    }

}
