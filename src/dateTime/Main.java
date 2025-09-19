package dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse("25.07.1995", formatter);

        DateTimeFormatter outPutFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy Q");
        String ruDateFormat = date.format(outPutFormatter);

        System.out.println(ruDateFormat);
    }
}
