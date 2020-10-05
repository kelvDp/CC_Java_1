package encapConstructors_ex9_2;

public class CustomerTest {
    public static void main(String[] args) {
        
        Customer newCustomer1 = new Customer("Gerald");

        System.out.println(newCustomer1.name);
        System.out.println(newCustomer1.getSsn());
    }
}
