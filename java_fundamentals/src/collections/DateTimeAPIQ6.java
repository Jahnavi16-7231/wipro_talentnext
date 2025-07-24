package collections;

import java.time.LocalTime;

public class DateTimeAPIQ6 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime beforeTime = now.minusHours(5).minusMinutes(30);

        System.out.println("Current Time: " + now);
        System.out.println("Time Before 5 Hours 30 Minutes: " + beforeTime);
    }
}

