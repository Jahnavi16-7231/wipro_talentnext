package collections;

import java.time.LocalDate;

public class DateTimeAPIQ4 {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        boolean isLeap = LocalDate.of(currentYear, 1, 1).isLeapYear();

        System.out.println("Current Year: " + currentYear);
        System.out.println("Is Leap Year? " + isLeap);
    }
}
