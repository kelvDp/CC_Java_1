package exceptions_ex14_1;

public class Cart {
    public static void main(String[] args) {
        Calc myCalc = new Calc();

        int addResult = myCalc.add(5, 15);
        System.out.println("Add result: " + addResult);

        // exception habdling to handle ArithmeticException
        try {
            double divResult = myCalc.divide(15, 0);
            System.out.println("The division result: " + divResult);
        } catch(ArithmeticException e) {
            System.out.println("There seems to be an error: " + e.getMessage());
        }

        
    }
}
