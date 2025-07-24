package collections;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeAPIQ3 {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2020, 1, 15); // change to your actual Wipro joining date
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println("Years: " + experience.getYears());
        System.out.println("Months: " + experience.getMonths());
        System.out.println("Days: " + experience.getDays());
    }
}

