/**
 * ეს კლასი გამოიყენება შეტყობინებების დასაწერად.
 */
public class Logger {

    /**
     * დაწერს შეცდომის შეტყობინებას.
     *
     * @param message
     */
    public static void error(String message) {
        System.err.println("[შეცდომა] " + message);
    }

    /**
     * დაწერს ინფომაციას შეტყობინების სახით.
     *
     * @param message
     */
    public static void info(String message) {
        System.out.println("[ინფორმაცია] " + message);
    }
}