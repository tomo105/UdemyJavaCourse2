package exc19_static__and_final_statement;

import java.util.ArrayList;

public class Main {
    public static int multiply = 7;

    public static void main(String[] args) {
//        Account tomAccount = new Account("Tom");
//        tomAccount.deposit(1000);
//        tomAccount.withdraw(234);
//        tomAccount.withdraw(-89);
//        tomAccount.deposit(-34);
//        tomAccount.calculateBalance();
//
//        ArrayList<StaticTest> instances = testStatic(5);
//        showTestInstances(instances);
//
//        int answer = multiply(5);
//        System.out.println(answer);
//
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        //  one.instanceNumber = 5; // error cause you can't change final varialbe !!!
//        //static final is use for constant value !!!
//        System.out.println(Math.PI);
//
//
//      //  Math m = new Math();// can not be created an instance !! final class and private constructor
//        int pw = 235634;
//       // Password password = new Password(pw);
//        Password password = new ExtendPassword(pw);
//        password.storePassword();
//        password.letMeIn(1);
//        password.letMeIn(235634);
        System.out.println("main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println(SIBTest.owner);



    }

    public static int multiply(int num) {
        return multiply * num;
    }

    public static  ArrayList<StaticTest> testStatic(int numberOfInstance) {
        if (numberOfInstance <= 0)
            return null;

        ArrayList<StaticTest> staticTests = new ArrayList<>();
        for (int i = 0; i < numberOfInstance; i++) {
            StaticTest test = new StaticTest("xdd");
            staticTests.add(test);
        }
        return staticTests;
    }
    public static void showTestInstances(ArrayList<StaticTest> staticTests) {
        for ( int i = 0; i< staticTests.size(); i++) {
            System.out.println("Created instances: " + staticTests.get(i).getNumInstance());
        }
    }

}
