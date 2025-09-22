package dateTime.task2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDateTime launchSatellite = LocalDateTime
                .of(1957, Month.OCTOBER, 4, 22, 28, 34);

        LocalDateTime now = LocalDateTime.of(2025, Month.FEBRUARY, 15, 10, 0);

        /*Duration duration = Duration.between(launchSatellite, now);

        Period period = Period.between(launchSatellite.toLocalDate() ,now.toLocalDate());

        int years = period.getYears();
        int month = period.getMonths();
        int days = period.getDays();

        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        int seconds = duration.toSecondsPart();*/

        long years = ChronoUnit.YEARS.between(launchSatellite, now);
        LocalDateTime reduceDate = launchSatellite.plusYears(years);

        long month = ChronoUnit.MONTHS.between(reduceDate, now);
        reduceDate = reduceDate.plusMonths(month);

        long days = ChronoUnit.DAYS.between(reduceDate, now);
        reduceDate = reduceDate.plusDays(days);

        long hours = ChronoUnit.HOURS.between(reduceDate, now);
        reduceDate = reduceDate.plusHours(hours);

        long minutes = ChronoUnit.MINUTES.between(reduceDate, now);
        reduceDate = reduceDate.plusMinutes(minutes);

        long seconds = ChronoUnit.SECONDS.between(reduceDate, now);

        System.out.printf("years: %d%n month: %d%n days: %d%n", years, month, days);
        System.out.printf("hours: %d%n minutes: %d%n seconds: %d%n", hours, minutes, seconds);
    }
}
