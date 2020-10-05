package getAndSetPractice;

public class ShirtTest {
    public static void main(String[] args) {
        // Shirt theShirt = new Shirt();

        // constructor
        Shirt theShirt = new Shirt('G', "random shirt", 20.22);

        System.out.println(theShirt.getDesc());
        System.out.println(theShirt.getPrice());
        System.out.println(theShirt.getColorCode());


        char colorCode;

        // set valid colorCode
        theShirt.setColorCode('R');
        colorCode = theShirt.getColorCode(); // here we use the getter and setter methods of the shirt obj

        System.out.println("Color code : " + colorCode);

        // set an invalid colorCode
        theShirt.setColorCode('Z');
        
        // colorCode = theShirt.getColorCode();

        // System.out.println("Color code : " + colorCode);

    }
}
