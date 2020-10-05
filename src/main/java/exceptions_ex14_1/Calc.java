package exceptions_ex14_1;

public class Calc {

    public int add(int x, int y) {
        return (x + y);
    }

    // this method can throw an Arithmetic exception
    public double divide(int x, int y) throws ArithmeticException {
        return (x / y);
    }
}
