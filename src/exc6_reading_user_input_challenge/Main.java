package exc6_reading_user_input_challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println( getBucketCount(3.4,2.1,1.5,2));
        System.out.println( getBucketCount(3.4,2.1,1.5));
        System.out.println( getBucketCount(3.26,0.75));
    }



    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
    if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0  )
        return -1;

    double area = width * height;
    double numberOfBuckets = Math.ceil(area / areaPerBucket);
    return ((int) numberOfBuckets) - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 )
            return -1;

        double area = width * height;
        double numberOfBuckets = Math.ceil(area / areaPerBucket);
        return ((int) numberOfBuckets);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0 )
            return -1;

        double numberOfBuckets = Math.ceil(area / areaPerBucket);
        return ((int) numberOfBuckets);
    }
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        double average = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
                scanner.nextLine();
            } else {
                if (count > 0) {
                    average = Math.round( (double)sum/ count );
                }
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }

    public static void printMinAndMaxFromInputNumbers() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int receive = scanner.nextInt();
                if (max < receive)
                    max = receive;
                if (min > receive)
                    min = receive;
            } else {
                System.out.println("minimum: " + min);
                System.out.println("maksimum: " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void getTenNumbersFromTHeUserForVersion() {
        int counter = 10;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < counter; i++) {
            System.out.println("Enter number #" + (i + 1));
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid input number");
                i--;
            }
            scanner.nextLine(); //handle end of line (enter key by a user )
        }

        System.out.println("suma= " + sum);
        scanner.close();
    }

    public static void getTenNumbersFromTHeUserWhileVersion() {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1));
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid input number");
            }
            scanner.nextLine(); //handle end of line (enter key by a user )
        }

        System.out.println("suma= " + sum);
        scanner.close();
    }
}
