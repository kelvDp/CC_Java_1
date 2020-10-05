package inheritanceExamples;

public class Shirt extends Clothing {
    
    private char fit = 'U'; // -- this is special to only the shirt class, not from parent


    // shirt constructor
    public Shirt(int id, String desc, char color, double price, char fit) {

        // pass the args up to parent class where prop fields are
        super(id, desc, color, price);
        // and here instantiate own prop
        this.fit = fit;
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit){
        this.fit = fit;
    }

    // these methods override the methods in clothing
    // do this by creating the same method but with diff method body
    public void display() {
        System.out.println("Shirt id : " + getItemID());
        System.out.println("Shirt description : " + getDesc());
        System.out.println("Shirt price : " + getPrice());
        System.out.println("Color code : " + getColorCode());
        System.out.println("Fit : " + getFit());
    }

    public void setColorCode(char colorCode) {
        if (colorCode != 'R' || colorCode != 'G' || colorCode != 'B') {
            System.out.println("Invalid colorCode");
        }
        super.setColorCode(colorCode);
    }

}
