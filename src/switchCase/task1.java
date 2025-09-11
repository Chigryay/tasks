package switchCase;

public class task1 {
    public static void main(String[] args) {
        String daysOfWeek = returnDaysOfWeek(1);
        System.out.println(daysOfWeek);
    }

    public static String returnDaysOfWeek(int day) {
        return switch (day) {
            case 1 -> {
                System.out.println("ds");
                yield "Понедельник";
            }
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "N/A";
        };
    }
}
