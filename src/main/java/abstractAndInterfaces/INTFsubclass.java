package abstractAndInterfaces;

// a class implements an inteface, no extends
public class INTFsubclass implements INTFclass {

    // here is one way to use the inherited method by manually overriding it
    // but it automaticall overrides as you use it so there is no use for the
    // @Override

    // @Override
    // public void print() {
    // // some code
    // }

    public void print() {
        System.out.println();
    }
}
