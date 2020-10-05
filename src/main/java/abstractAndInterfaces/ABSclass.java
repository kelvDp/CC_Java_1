package abstractAndInterfaces;

public abstract class ABSclass {

    private int id;

    // this is a concrete method, so the subclass can use it if it wants to
    public int getId() {
        return id;
    }

    // here are abstratc methods. So the subclasses HAVE to use them
    // they are only named in here, not implemented
    // the subclass has to implement them.

    public abstract double getPrice();

    public abstract void display();

}
