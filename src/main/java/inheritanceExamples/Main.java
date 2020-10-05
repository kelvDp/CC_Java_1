package inheritanceExamples;

public class Main {
    public static void main(String[] args) {
        Shirt newShirt1 = new Shirt(1, "A shirt", 'R',12.20, 'M');

        System.out.println(newShirt1.getFit());
        newShirt1.setFit('L');
        System.out.println(newShirt1.getFit());

    }
}
