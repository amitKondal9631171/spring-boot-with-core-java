package techmahindra.Java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Introduced new date time api
 */
public class JavaLocalDataApi {

    public void testChromoUnits() throws ParseException {

        //Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        //add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        //add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        //add 1 year to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        //add 10 years to the current date
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Date after ten year: " + nextDecade);
    }

    //    Period − It deals with date based amount of time
    public void testPeriod() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);

        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    //Duration − It deals with time based amount of time.
    public void testDuration() {
        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(2);

        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);

        System.out.println("Duration: " + duration);
    }
    //TemporalAdjuster is used to perform the date mathematics. For example, get the "Second Saturday of the Month" or "Next Tuesday".
    public void testAdjusters() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        //get the next tuesday
        LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Tuesday on : " + nextTuesday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second Saturday on : " + secondSaturday);
    }

    public void testLocalDateTime() throws ParseException {
        String input = "2017-01-18 20:10:00";
        SimpleDateFormat oldFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = oldFormat.parse(input);
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
        String output = newFormat.format(date);
        System.out.println("Java 7 formatted date: "+output);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Local date and time: "+ nowDateTime.toString());
        System.out.println("java 8 formatted date: "+ nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
 /*
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("current time: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +", day: " + day +", seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2019);
        System.out.println("provided day month year time: " + date2);

        //12 december 2014
        LocalDate date3 = LocalDate.of(2019, Month.DECEMBER, 12);
        System.out.println("date of given values: " + date3);

        //22 hour 15 minutes
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("Time of given values: " + date4);

        //parse a string
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("String to time: " + date5);*/
    }

    public static void main(String args[]) throws ParseException {
        JavaLocalDataApi java8tester = new JavaLocalDataApi();
        java8tester.testLocalDateTime();

       /* //java.time.temporal.ChronoUnit enum is added in Java 8 to replace the integer values used in old API to represent day, month, etc.
        System.out.println("\n chronic implementation");
         System.out.println("\n period implementation");
        java8tester.testPeriod();
        System.out.println("\n duration implementation");
        java8tester.testDuration();
        System.out.println("\n Adjustern implementation");
        java8tester.testAdjusters();*/
    }
}
