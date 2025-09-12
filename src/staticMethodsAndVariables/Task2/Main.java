package staticMethodsAndVariables.Task2;

import staticMethodsAndVariables.Task2.ConfigUtils.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig.printConfig();
        AppConfig.initialize();

    }
}
