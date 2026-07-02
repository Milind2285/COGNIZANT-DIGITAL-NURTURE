public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Singleton Pattern Test ---\n");

        // Attempt to create two separate loggers
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the logger
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        System.out.println("\n--- Verification ---");
        
        // Verify that both variables point to the same instance
        if (logger1 == logger2) {
            System.out.println("SUCCESS: logger1 and logger2 point to the exact same instance in memory.");
        } else {
            System.out.println("FAILURE: logger1 and logger2 are different instances.");
        }
    }
}