package com.tutorial.java.fundamentals.date;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class DateLesson {

    //The java.time, java.util, java.sql and java.text packages contains classes for representing date and time.
    public static void main(String[] args) {
//        localDateLesson();
//        localTimeLesson();
//        localDateTimeLesson();

        monthDay();

    }

    private static void monthDay() {
        MonthDay currentMonthDay = MonthDay.now();
        MonthDay leapYearFebruary = MonthDay.of(Month.FEBRUARY, 29);

        System.out.println("Current month day " + currentMonthDay);
        System.out.println("leap year february " + leapYearFebruary);
        boolean validYear = leapYearFebruary.isValidYear(2022);
        System.out.println("Is it valid year " + validYear);



        //see local date for more about its method
    }

    private static void localDateTimeLesson() {
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        LocalDateTime ourDateTime = LocalDateTime.of(2000, Month.FEBRUARY, 3, 12, 30, 15, 222222);
        System.out.println("Current date time " + currentLocalDateTime);
        System.out.println("Our date time " + ourDateTime);
        LocalDateTime nextTwoMonths = currentLocalDateTime.plusMonths(2);
        System.out.println("Next two months " + nextTwoMonths);

        //see local date for more about its method
    }

    private static void localTimeLesson() {

        //create localTime
        LocalTime currentTime = LocalTime.now();
        LocalTime nanoTime = LocalTime.of(12, 20, 12, 123);
        System.out.println("Current time " + currentTime);
        System.out.println("Nano time " + nanoTime);


        //atTime
        LocalDateTime currentLocalDateTime = currentTime.atDate(LocalDate.now());
        System.out.println("Current local date time " + currentLocalDateTime);

        //format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String format = nanoTime.format(formatter);
        System.out.println("Format nano time " + format);

        //minusHours
        LocalTime twoHoursAgo = nanoTime.minusHours(2);
        System.out.println("Two hours ago " +  twoHoursAgo);

        if(nanoTime.isBefore(currentTime)) {
            System.out.println("You are pass schedule ");
        }

        //see local date for more about its method

    }

    private static void localDateLesson() {
        LocalDate now = LocalDate.now();
        LocalDate registrationDate = now;
        LocalDateTime localDateTime = registrationDate.atTime(LocalTime.MIDNIGHT);
        createProfile("Ade", "Shola", localDateTime);

        //compareTo
        LocalDate anotherDate = LocalDate.ofYearDay(2022, 352);
        int i = now.compareTo(anotherDate);
        System.out.println(i);
        if (i > 0 ){
            System.out.println(now + " is greater than " + anotherDate);
        }else if (i < 0) {
            System.out.println(now + " is less than " + anotherDate);
        }else {
            System.out.println(now + " is equal to " + anotherDate);
        }

        //equals
        System.out.println(now.equals(anotherDate));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        String format = now.format(formatter);
        System.out.println(format);

        //get
        System.out.println(now.get(ChronoField.YEAR));

        //isLeapYear
        System.out.println(now.isLeapYear());

        //minusDays
        System.out.println(now.minusDays(15));

        //minusMonnth
        System.out.println(now.minusMonths(15));

        //plusDays
        System.out.println(now.plusDays(3));

        //plusMont

        //getDayOfMonth getMonth getYear
        System.out.println("Todays date is " + now.getDayOfMonth() + " " + now
                .getMonth() + " " + now.getYear());

        //parse
        LocalDate parsedDate = LocalDate.parse("2022-12-09");
        System.out.println(parsedDate);

        LocalDate anotherParsedDate = LocalDate.parse(format, formatter);
        System.out.println(anotherParsedDate);
    }

    private static void  createProfile(String firstName, String lastName, LocalDateTime regDate) {

        System.out.println("firstName = " + firstName);
        System.out.println("LastName = " + lastName);
        System.out.println("RegDate = " + regDate);
    }

}
