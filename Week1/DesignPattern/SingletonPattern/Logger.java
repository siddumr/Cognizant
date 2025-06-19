public class Logger {
    private static Logger i;

    private Logger() {
        System.out.println("Logger created!!!!");
    }

    public static Logger getInstance() {
        if (i == null) {
            i = new Logger();
        }
        return i;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
