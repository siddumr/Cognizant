public class LoggerTest {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();

        a.log("Hello!");
        b.log("This is a test.");

        System.out.println("Checking if both logger instances are the same...");
        if (a == b) {
            System.out.println("Same instance confirmed!");
        } else {
            System.out.println("Different Logger instances (This should not happen!)");
        }
    }
}
