package exc21_Test_Codility;

public class Main {

    public static void main(String[] args) {
        int[] tabb = solution(2);
        for (int i : tabb) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++");
        int[] tabb2 = solution(3);
        for (int i : tabb2) {
            System.out.println(i);
        }

        int[] x = new int[]{1, 2, 3, 4, 5};
        System.out.println("++++++++++++++++");
        System.out.println(solution2(x, 3));
        System.out.println(solution2(x, 8));
        System.out.println(solution2(x, 2));
        System.out.println(solution2(x, 5));
        System.out.println(solution2(x, 1));

        System.out.println("==================");
        int[] xx = new int[]{3, 8, 9, 7, 6};
        int[] res = rotateTabKTimesSecondVersion(xx, 3);

        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public static int[] solution(int n) {
        int[] tab = new int[n];
        if (n == 1) {
            return tab;
        } else if (n % 2 == 1) {
            for (int i = 0; i < n - 1; i += 2) {
                tab[i + 1] = i + 1;
                tab[i + 2] = -(i + 1);
            }
        } else {
            for (int i = 0; i < n; i += 2) {
                tab[i] = i + 1;
                tab[i + 1] = -(i + 1);
            }
        }
        return tab;
    }

    public static int solution2(int[] A, int x) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }

        int l = 0;
        int r = N - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (A[m] > x) {
                r = m - 1;
                System.out.println("r = m - 1");
                // l++;
            } else {
                l = m + 1;
                System.out.println(" l = m +1");
                //  r = m -1;
            }
        }
        if (A[--l] == x) {
            return l;
        }
        return -1;
    }

    public static int[] rotateTabKTimes(int[] A, int K) {
        //  int[] tab = A;
        while (K > 0) {
            int temp = 0;
            //     System.out.println(A[A.length]);
            for (int i = A.length - 1; i > 0; i--) {
                if (i == (A.length - 1)) {
                    System.out.println("xd");
                    temp = A[i]; //save old values
                }
                A[i] = A[i - 1];
            }
            A[0] = temp; //
            K--;
        }
        return A;
    }

    public static int[] rotateTabKTimesSecondVersion(int[] A, int K) {
        int[] tab = new int[A.length];
        int start = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (index < (A.length - K)) {
                tab[index + K] = A[i];
                index++;
            } else {
                tab[start] = A[i];
                start++;
            }
        }
        return tab;
    }

}
