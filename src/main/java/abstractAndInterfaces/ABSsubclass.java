package abstractAndInterfaces;

public class ABSsubclass extends ABSclass {

    // here is the concrete method that does not have to be implemented
    // but for sake of example
    public int getId() {
        return 7;
    }

    // here are the two abstract methods from the parent class that has to be
    // implemented
    public double getPrice() {
        return 5.40;
    }

    public void display() {
        System.out.println();
    }
}
