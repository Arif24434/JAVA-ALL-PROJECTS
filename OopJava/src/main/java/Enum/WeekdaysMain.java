package Enum;

public class WeekdaysMain {
    public static void main(String[] args) throws IllegalAccessException {
        printWeekdaysName(WeekDays.MON);
        printWeekdaysName(WeekDays.TUE);
        printWeekdaysName(WeekDays.WED);
        printWeekdaysName(WeekDays.TUE);
        printWeekdaysName(WeekDays.FRI);
        printWeekdaysName(WeekDays.SAT);
        printWeekdaysName(WeekDays.SUN);

    }

    public static void printWeekdaysName(WeekDays weekdays) throws IllegalAccessException {
        System.out.println(weekdays.getEnglishName());
        System.out.println(weekdays.getPolishName());
        System.out.printf("%s-%s%n",weekdays.getEnglishName(),weekdays.getPolishName());
        System.out.println(WeekDays.FRI.ordinal());

        WeekDays weekDays= WeekDays.SUN.fromPolishNames();
        printWeekdaysName(weekDays);
    }
}


