package encapConstructors_ex9_1;

public class CustomersTest {
    public static void main(String[] args) {
        // Customers customer1 = new Customers();

        // customer1.setName("Dave");
        // System.out.println(customer1.getName());

        // System.out.println(customer1.getSSN());


        // this snippet uses a constructor
        Customers customer1 = new Customers("Bonny");

        System.out.println(customer1.getName());

        System.out.println(customer1.getSSN());
    }
}
