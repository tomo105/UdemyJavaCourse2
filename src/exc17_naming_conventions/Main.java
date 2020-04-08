package exc17_naming_conventions;

import com.exmaple.mypackage.Series;

public class Main {
    public static void main(String[] args) {

        MyWindow myWindow = new MyWindow("Java");
        myWindow.setVisible(true);

        // i have made a .jar file from class Series with static method nSum(int n), factorial(int n) and fibonacci(int n)
        // added jar file to my packages
        // test if this works :
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }

    }
}
