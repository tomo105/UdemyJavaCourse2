package exc5_control_data_flow_part2_dealing_with_interactive_user;

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
        System.out.println(getLargestPrime(3453));
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
        while (number > 1 ) {
            if (number % div == 0) {
                prime = number;
                number /= div;
                if (number == 1)
                    break;
            }
            else
                div++;
        }
        return prime;

    }




}
