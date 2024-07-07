package dev.manyroads;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TestDates {

    /**
     * Method which returns the number of day between current date and given day in te past
     */
    public static long daysPastBetweenNowAndGivenDate(LocalDate givenDate) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");

        String sToday = LocalDateTime.now().format(dtf);
        String sGivenDate = givenDate.format(dtf);

        LocalDate today = LocalDate.parse(sToday, dtf);
        LocalDate givenDate_ = LocalDate.parse(sGivenDate, dtf);

        // Conversion from Date to LocalDate in current zone
        //LocalDate dateInThePast = givenDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Duration of calender days
        long duration = ChronoUnit.DAYS.between(today, givenDate_);

        return duration;
    }

    public static void main(String[] args) {
        long days = TestDates
                .daysPastBetweenNowAndGivenDate(
                        LocalDate
                                .now()
                                .minusDays(-1));
        System.out.println("days: " + days);
    }
}
