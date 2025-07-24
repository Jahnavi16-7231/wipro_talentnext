package collections;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class DateTimeAPIQ2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);

        int sundayCount = 0;
        LocalDate secondSunday = firstDayNextMonth;

        while (true) {
            if (secondSunday.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    break;
                }
            }
            secondSunday = secondSunday.plusDays(1);
        }

        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}
