package exc4_for_while;

public class Main {
    public static void main(String[] args) {
//        int sum = 0;
//        int counter = 0;
//        for (int i = 0; i < 10000 && counter <= 5; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                sum += i;
//                counter++;
//                System.out.println(i);
//            }
//        }
//        System.out.println("Sum= " + sum);
        int num = 4;
        int counter = 0;
        int sum = 0;
        while (num < 20) {
            num++;
            if (!isEven(num))
                continue;

            System.out.println("Even number= " + num);
            sum += num;
            if (++counter == 5)
                break;
        }
        System.out.println(sum);
        System.out.println(sumDigits(1234561));
        System.out.println(sumDigits(80));
        System.out.println(sumDigits(-4561));
        System.out.println(sumDigits(125));
        System.out.println(isPalindrome(-12321));
        System.out.println(sumFirstAndLastDigit(1288346));
        System.out.println(sumFirstAndLastDigit(4));
        System.out.println(getEvenDigitSum(34523));
        System.out.println(getDigitCount(2354));
        System.out.println(reverse(-342));
        numberToWords(1230);
    }

    public static boolean isOdd(int number) {
        if (number < 0)
            return false;
        if (number % 2 == 1)
            return true;
        else
            return false;
    }

    public static boolean isEven(int number) {
        if (number < 0)
            return false;
        if (number % 2 == 0)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0 || start > end)
            return -1;
        int sum = 0;
        for (int i = start; i <= end; i++)
            if (isOdd(i))
                sum += i;

        return sum;
    }

    public static int sumDigits(int number) {
        if (number < 10)
            return -1;

        int sum = 0;

        while (number > 0) {
            int modulo = number % 10;
            number = number / 10;
            sum += modulo;
        }

        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int inputNumber;
        if (number < 0) {
            inputNumber = number * -1;
            number *= -1;
        } else
            inputNumber = number;

        while (number > 0) {
            int modulo = number % 10;
            reverse = reverse * 10 + modulo;
            number /= 10;
        }
        System.out.println("revers" + reverse);
        return inputNumber == reverse;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        if (number < 10)
            return number * 2;

        int sum = 0;
        int modulo = number % 10;
        sum += modulo;
        number /= 10;

        while (number > 0) {
            number /= 10;

            if (number < 10) {
                sum += number;
                System.out.println(number);
                break;
            }
        }

        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        int sum = 0;

        while (number > 0) {
            int modulo = number % 10;
            if (modulo % 2 == 0)
                sum += modulo;
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99)
            return false;
        int moduloFirst = first % 10;
        int moduloSecond = second % 10;
        if (moduloFirst == moduloSecond)
            return true;

        first /= 10;
        second /= 10;

        while (first > 0) {
            int moduloFirst2 = first % 10;
            int moduloSecond2 = second % 10;

            if (moduloFirst2 == moduloSecond2 || moduloFirst == moduloSecond2 || moduloSecond == moduloFirst2)
                return true;

            first /= 10;
            second /= 10;
        }

        return false;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (!isValid(one) || !isValid(two) || !isValid(three))
            return false;
        int lastOne = 0, lastTwo = 0, lastThree = 0;

//        while(one > 0 || two > 0 || three > 0 )
//        {
//            one /= 10;
//            two /= 10;
//            three /= 10;
//             if(one < 10 )
        lastOne = one % 10;
//            if(two < 10)
        lastTwo = two % 10;
//            if(one < 10)
        lastThree = three % 10;
//
//
//        }
        return lastOne == lastTwo || lastOne == lastThree || lastTwo == lastThree;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;
        do {
            if (first > second)
                first -= second;
            else
                second -= first;
        }
        while (first != second);
        return first;
    }

    public static void printFactors(int number) {
        if (number < 1)
            System.out.println("Invalid Value");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1)
            return false;

        int sum = 0;
        for (int i = 1; i <= number / 2; i++)
            if (number % i == 0)
                sum += i;

        return number == sum;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        if (number == 1)
            return 1;

        int sum = 0;
        while (number > 0) {
            sum += 1;
            number /= 10;
        }
        return sum;
    }

    public static int reverse(int number) {

        int rev = 0;
        while (number != 0) {
            int modulo = number % 10;
            rev = rev * 10 + modulo;
            number /= 10;
        }
        return rev;
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        int count = getDigitCount(number);
        int num = reverse(number);

        for (int i = 0; i < count; i++) {
            int modulo = num % 10;
            switch (modulo) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
            }

            num /= 10;
        }
    }
}
