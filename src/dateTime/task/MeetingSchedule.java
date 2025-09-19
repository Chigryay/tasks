package dateTime.task;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MeetingSchedule {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstThursday = findFirstThursday(today);

        LocalDate lastMeeting = findLastMeeting(firstThursday);

        printAllMeetingDays(firstThursday, lastMeeting);
    }

    public static LocalDate findFirstThursday(LocalDate today) {
        LocalDate firstThursday = today;
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            LocalDate findThursday = today.plusDays(i);
            if (findThursday.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
                firstThursday = findThursday;
                break;
            }
        }
        return firstThursday;
    }

    public static LocalDate findLastMeeting(LocalDate firstMeeting) {
        return firstMeeting.plusWeeks(6);
    }

    public static void printAllMeetingDays(LocalDate firstMeeting, LocalDate lastMeeting) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE");
        int step = 1;
        while (firstMeeting.isBefore(lastMeeting)) {
            LocalDate meetingDay = firstMeeting;
            System.out.println(meetingDay.format(formatter));
            firstMeeting = firstMeeting.plusWeeks(step);
        }
    }
}
