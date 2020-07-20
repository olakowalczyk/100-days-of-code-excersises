package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    private static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static int dayNumber;
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args){
        getDay();
        System.out.println("Your day is " + getStringValueOfADay() + "!.");
    }

    public static void getDay(){
        System.out.println("Provide number of a day of the week: ");
        dayNumber = scanner.nextInt();
    }

    public static String getStringValueOfADay(){
        return weekDays[dayNumber - 1];
        }
    }
