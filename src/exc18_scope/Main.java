package exc18_scope;

import java.util.Scanner;

public class Main {
    private static Scanner sc =  new Scanner(System.in) ;
    //Java look backwards to find available variable !!!
    public static void main(String[] args) {
        String varFour = "private to main"; // only in main
        ScopeCheck scope = new ScopeCheck();
        System.out.println("scope var5 is = " + scope.getVarOne());
        System.out.println(varFour); //only one available
        System.out.println("#############");
        scope.timesTwo();
        ScopeCheck.InnerClass innerClass = scope.new InnerClass();
        innerClass.timesTwo();

        //chalenge
        X x = new X(sc.nextInt());
        x.x();
    }
}
