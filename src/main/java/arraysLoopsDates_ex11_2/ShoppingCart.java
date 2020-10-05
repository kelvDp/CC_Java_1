package arraysLoopsDates_ex11_2;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        name = args[0];
        age = Integer.parseInt(args[1]);

        if (args.length != 2) {
            System.out.println("Have to add in two arguments, name and age");
        }
        else {
            System.out.println("Name : " + name + ", Age : " + age);
        }
    }
}
