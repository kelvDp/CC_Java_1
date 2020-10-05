package argsArray;

public class argArray {

    // the args array in the main method can actually contain values that can be used inside of the file
    // for now you have to add the args by command line when compiling the class
    // java <filename>.java hello world
    // so args[0] = 'hello' and args[1] = 'world';

    public static void main(String[] args) {
        // will only print in cmd now
        System.out.println("arg 0 = " + args[0] + " args 2 = " + args[1]);

        // if you enter numbers into the cmd it will be seen as a string so you'd have to convert them to 
        // a numerical type if you want to use them as such:
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);

        System.out.println("Total is : " + (arg1 + arg2));
    }
}
