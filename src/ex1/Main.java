package ex1;

import javax.xml.stream.FactoryConfigurationError;

public class Main {
    public static void main(String[] args) {
        System.out.println("zapierdalaj tomasz!!");

        int name = 4;
        int second = 12;
        int third = 33;
        int sum = second + name + third - 10;
        System.out.println(name + second + third + " " + sum);
        int myLastOne = 1000 - third;
        System.out.println(myLastOne);
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        int a = 214748360;
        System.out.println("maxValue of integer " + maxValue);
        System.out.println("minValue of integer " + minValue);

        //casting
        byte minByteValue = Byte.MIN_VALUE;
        short shortByteValue = Short.MIN_VALUE;
        byte myNewByte = (byte) (minByteValue / 2);

        //challenge
        byte byteVariable = 1;
        short shortVariable = 21;
        int intVariable = -7;
        long longFinalVariable = 50000L + 10L * (byteVariable + shortVariable + intVariable);
        short sshort = (short) (1000 + 10 * (byteVariable + shortVariable + intVariable));
        System.out.println(longFinalVariable + "  " + sshort);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println(minFloat);
        System.out.println(maxFloat);

        double mindouble = Double.MIN_VALUE;
        double maxdouble = Double.MAX_VALUE;
        System.out.println(mindouble);
        System.out.println(maxdouble);

        int myNewInt = 5 / 3;
        float myNewFloat = 5f / 3f; //or cast (float) (5.45);
        double myNewDouble = 5d / 3d;
        System.out.println("int " + myNewInt + " double " + myNewDouble + " float " + myNewFloat);

        //chaleenge
        //convert pounds to kilos
        double pounds = 200d;
        double kilos = pounds * 0.45359237d;
        System.out.println(pounds + " pounds = " + kilos + " kilos");
        double Pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;  //zero was ignored
        System.out.println(Pi + " " + anotherNumber);

        char myChar = 'D'; //only one character
        char myCharChinese = '\u0194';
        System.out.println(myCharChinese);
        boolean aa = true;
        boolean b = false;
        String myString = "zapierdalaj!";
        System.out.println(myString);
        String anotherString = "inny string +\u0007 " + myString;
        System.out.println(anotherString);
        int operator = 45 + 5;
        boolean trueStatement = true;

        while (operator >= 40) {
            System.out.println((Integer.parseInt("100") + operator));
            operator--;
        }

        int topScore = 102;
        if (topScore != 100 || topScore > 40)
            System.out.println("you fucking win!!");

        //challenge
        int something = 50;
        if (something == 50) {
            System.out.println("no siema");
        }

        boolean isCar = false;
        int isDefinatelyCar = isCar ? 3 :  7;
        System.out.println(isDefinatelyCar);

        //challenge
        double twenty = 20.00d;
        double eighty = 80.00d;
        double summary = (twenty + eighty) * 100.00d;
        double remainder  = summary % 40.0d;
        boolean ifNotZero = (remainder == 0 ) ? true : false;// or remainder == 0
        System.out.println(ifNotZero);
        if(! ifNotZero)
        {
            System.out.println("Got some  remainder");
        }

    }
}








