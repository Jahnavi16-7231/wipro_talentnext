package collections;

import java.time.LocalDate;

	public class DateTimeAPIQ1 {
	    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        LocalDate futureDate = today.plusDays(10);

	        System.out.println("Today's Date: " + today);
	        System.out.println("Date After 10 Days: " + futureDate);
	    }
	}
