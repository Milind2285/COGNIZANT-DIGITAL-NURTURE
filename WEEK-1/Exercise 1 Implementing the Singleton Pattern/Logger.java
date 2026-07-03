public class Logger {
    
    // 1. Volatile static variable to hold the single instance
    private static volatile Logger instance;

    // 2. Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // 3. Public static method to provide global access
    public static Logger getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Logger.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Example utility method for the logger
    public void log(String message) {
        System.out.println("[LOG] " + java.time.LocalDateTime.now() + " : " + message);
    }
}