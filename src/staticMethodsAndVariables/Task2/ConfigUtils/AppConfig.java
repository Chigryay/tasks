package staticMethodsAndVariables.Task2.ConfigUtils;

public class AppConfig {
    private static String APP_NAME;
    private static String APP_VERSION;
    private static boolean DEBUG_MODE;

    public static void initialize() {
        APP_NAME = "Name";
        APP_VERSION = "1.0";
        DEBUG_MODE = false;
    }

    public static void printConfig() {
        System.out.println(APP_NAME + " " + APP_VERSION + " " + DEBUG_MODE);
    }
}
