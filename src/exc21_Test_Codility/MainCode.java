package exc21_Test_Codility;

import java.util.*;

public class MainCode {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] A = new int[]{1, 3, 6, 4, 1, 2};

        //printList(array);
        System.out.println(smallest(A));

        System.out.println(solution("tom", "P{achla", 19));
        System.out.println(solution(5));
        System.out.println(solution(3,7));

    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("i " + list[i]);
        }
    }

    public static int smallest(int[] A) {
        Arrays.sort(A);
        int min = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                min++;
            }
        }
        return min;
    }

    public static String solution(String name, String surname, int age) {
            if (name.length() < 2 || name.length() > 20 ||
                    surname.length() < 2 || surname.length() > 20 ||
                    age < 1 || age >100) {
                return "Invalid one of parameter";
            }
        return name.substring(0, 2) + surname.substring(0, 2) + age;

    }

    public static String solution(int N) {
        String s = "";

        if (N > 100 || N < 1) {
            return s;
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0)
                s += "+";
            else
                s += "-";
        }
        return s;
//https://app.codility.com/c/feedback/8552R4-R4A/
    }
    public static int solution(int A, int B) {

        String bin = Integer.toBinaryString(A * B);
        int count = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == 49)
                count++;
        }
        return count;
    }
}
