package exceptionExamples;

public class Utils {
    
    // method with a try/catch block to handle exception that was thrown
    public static void doThis(){

        try {
            doThat();
        } catch (Exception e) {
            System.out.println("doThis : Caught the exception ! : " + e.getMessage());
        }
    }

    // method that explicitly throws an exception
    public static void doThat() throws Exception {
        System.out.println(" doThat : Throwing exception");
        throw new Exception("Ouch !");
    }
}
