package ex3_switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("type one letter a,b,c or d ");
        // Scanner sc = new Scanner(System.in);
        // char character = sc.next().charAt(0);
        char character = 'a';

        switch (Character.toUpperCase(character)) {
            case 'A':
                System.out.println("It is char A");
                break;
            case 'B':
                System.out.println("It is char B");
                break;
            case 'C':
                System.out.println("It is char C");
                break;
            case 'D':
                System.out.println("It is char D");
                break;
            default:
                System.out.println("not char A,B,C or D");
        }
        ifElsePrintDayOfTheWeek(3);
        switchPrintDayOfTheWeek(4);
        System.out.println(isLeapYear(400));

        for (int i = 8; i >= 2; i--)
            System.out.println(getDaysInMonth(i, 2020));
        int counter = 0;
        System.out.println("****************");
        for (int i = 456; i < 1000 && counter < 100; i++)
            if (isPrimeNumber(i)) {
                counter++;
                System.out.println(i);
            }

    }

    private static void ifElsePrintDayOfTheWeek(int day) {
        if (day == 0)
            System.out.println("This is Monday");
        else if (day == 1)
            System.out.println("This is Tuesday");
        else if (day == 2)
            System.out.println("This is Wednesday");
        else if (day == 3)
            System.out.println("This is Thursday");
        else if (day == 4)
            System.out.println("This is Friday");
        else if (day == 5)
            System.out.println("This is Saturday");
        else if (day == 6)
            System.out.println("This is Sunday");
        else
            System.out.println("Invalid day");

    }

    private static void switchPrintDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("this is Monday");
                break;
            case 1:
                System.out.println("this is tuesday");
                break;
            case 2:
                System.out.println("this is Wednesday");
                break;
            case 3:
                System.out.println("this is Thursday");
                break;
            case 4:
                System.out.println("this is Friday");
                break;
            case 5:
                System.out.println("this is Saturday");
                break;
            case 6:
                System.out.println("this is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public static Boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999)
            return false;

        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else return year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12)
            return -1;
        else if (year < 1 || year > 9999)
            return -1;
        else {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year))
                        return 29;
                    else
                        return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 1)
            return false;
        for (int i = 2; i <= (long) Math.sqrt(number) ; i++)
            if (number % i == 0)
                return false;
        return true;
    }

}
