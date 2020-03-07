package exc11_autoboxing_unboxing;

import java.util.ArrayList;

class IntCLass {
    private int MyValue;

    public IntCLass(int myValue) {
        MyValue = myValue;
    }

    public int getMyValue() {
        return MyValue;
    }

    public void setMyValue(int myValue) {
        MyValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        //autoboxing
        String[] array = new String[10];
        int[] arrayInt = new int[10];
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("tom");

        ArrayList<IntCLass> intArrayList = new ArrayList<IntCLass>();
        intArrayList.add(new IntCLass(234));

        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            integers.add(Integer.valueOf(i));  //int to Integer
        }

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Value " + i + " == " + integers.get(i).intValue()); //from Integer to int
        }

        Integer myInt = 34;  // java machine converts this to --> Integer.valueOf(34);     ____autoboxing___ int to Integer
        int anotherInt = myInt;  // java machine converts  myInt to myInt.intValue()       ____unboxing_____  Integer to int
        int anotherIntValue = myInt.intValue();

        ArrayList<Double> myDouble = new ArrayList<Double>();
        for (double i = 0.0; i <= 10; i += 0.5) {
            myDouble.add(i);
        }
        for (int i = 0; i < myDouble.size(); i++) {
            double value = myDouble.get(i);
            System.out.println(value);
        }
        //----------------------------challenge-------------------------------------------
        Bank bank = new Bank("Amber Gold");
        bank.addNewBranch("Barcelona");
        bank.addCustomer("Tomasz","Barcelona",234.54);
        bank.addCustomerTransaction("Barcelona","Tomasz", 44.46);
        bank.addCustomerTransaction("Barcelona","Tomasz", -10.43);

        bank.addNewBranch("Juarez");
        bank.addCustomer("Tomasz","Juarez",234.54);
        bank.addCustomerTransaction("Juarez","Tomasz", 44.46);
        bank.addCustomerTransaction("Juarez","Tomasz", -10.43);

        bank.addCustomer("Ania","Juarez",234.54);
        bank.addCustomerTransaction("Juarez","Ania", -44.46);
        bank.addCustomerTransaction("Juarez","Ania", 44.46);

        bank.listOfCustomers("Barcelona",false);
        bank.listOfBranches();
        bank.listOfCustomers("Juarez",true);


    }
}
