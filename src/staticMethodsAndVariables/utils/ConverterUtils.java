package staticMethodsAndVariables.utils;

public class ConverterUtils {
    private static String[] daysOfWeek = {
            "N/a" ,"пон", "вт", "ср", "чт", "пт", "сб", "вскр"
    };

    public static String converter(int numberDay) {
        return numberDay > 0 && numberDay < 8 ?
            daysOfWeek[numberDay] :
            daysOfWeek[0];
    }
}
