package ex2;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 2, 40, 67, 68, 97};
        System.out.println("in");
        System.out.println(solution(tab, 1));
        System.out.println("out");
    }

    private static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }

        int l = 0;
        int r = N - 1;
        while (l <= r) {
            int m = (l + r);
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (A[--l] == X) {
            return l;
        }

        return -1;
    }
}
