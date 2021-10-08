package com.company;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("enter date of month you were born: ");
    int day = input.nextInt();
    System.out.println("enter month you were born: ");
    int month = input.nextInt();
    System.out.println("enter year you were born: ");
    int year = input.nextInt();
    LocalDate date = LocalDate.of(year, month, day);
    System.out.println("date of birth: " + date);
    LocalDate now = LocalDate.now();
    System.out.println("todays date: " + now);

    LocalDate yearsOff = now.minusYears(year);
    LocalDate monthsOff = yearsOff.minusMonths(month);
    LocalDate daysOff = monthsOff.minusDays(day);
    System.out.println("you have been alive for: " + daysOff);





    }
}
