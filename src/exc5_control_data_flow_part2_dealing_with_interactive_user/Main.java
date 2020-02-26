package exc5_control_data_flow_part2_dealing_with_interactive_user;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String wordAsNum = "123";
        int number = Integer.parseInt(wordAsNum);
        System.out.println("num =" + number);
        number++;
        System.out.println("num =" + number);
        String wordAsDouble = "12.45";
        double numberDouble = Double.parseDouble(wordAsDouble);
        System.out.println("num =" + numberDouble);
        numberDouble++;
        System.out.println("num =" + numberDouble);
        System.out.println(canPack(1, 0, 5));
        System.out.println("Largest prime number from factor" + getLargestPrime(217));
        printSquareStar(8);

        //-------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age year:");
        int age;
        if (scanner.hasNextInt()) { //check if next value in scanner is a int if it's int return true else false
            age = 2020 - scanner.nextInt(); //or int age = Integer.parseInt(value);
            // if we click a enter it is end line
            // so we must use next line to handle exception

            scanner.nextLine(); // handle next line character soo we can write another line !!!
            System.out.println("enter your name:");
            String name = scanner.nextLine();
            scanner.close();

            if (age >= 0 && age <= 100) {
                System.out.println("Age: " + age + "\nname: " + name);
            } else {
                System.out.println("Invalid year of birth number");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
    }

    //flour pack problem
    //                           5 kilo   ,  1 kilo
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        /*
  * Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
The parameter bigCount represents the count of big flour bags (5 kilos each).
The parameter smallCount represents the count of small flour bags (1 kilo each).
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
* The method should return true if it is possible to make a package with goal kilos of flour.
If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
*  For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos
*  and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true
* because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
If any of the parameters are negative, return false.*/
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        while (goal >= 5 && bigCount > 0) {
            goal -= 5;
            bigCount--;
        }
        return smallCount - goal >= 0;
    }

    public static int getLargestPrime(int number) {
        //  Write a method named getLargestPrime with one parameter of type int named number.
        // If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
        // The method should calculate the largest prime factor of a given number and return it.
        if (number < 0)
            return -1;
        int div = 2;
        int prime = -1;

        while (number > 1) {
            if (number % div == 0) {
                prime = number;
                number /= div;
                System.out.println(prime);
                if (number == 1)  //podzielona przez sama siebie daje 1 jesli nie to znaczy ze jest wieksza
                {
                    System.out.println("div = " + div);
                    break;
                }
            } else
                div++;
        }

        return prime;
    }

    public static void printSquareStar(int number) {
        /*
        Write a method named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*).
This should be accomplished by using loops (see examples below).


EXAMPLE INPUT/OUTPUT:

printSquareStar(5); should print the following:
Explanation:
*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars
The patterns above consist of a number of rows and columns (where number is the number of rows to print).
 For each row or column, stars are printed based on four conditions (Read them carefully):
* In the first or last row
* In the first or last column
* When the row number equals the column number
* When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)*/
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || j == number - i - 1)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


}
