package exc10_arrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
        System.out.println("Min value" + findMin(sortedArray));
        int[] tab = new int[] {1,4,7,2,5,9};
        int[] rev = reverseWithoutAnotherTab(tab);
        printArray(rev);
    }

    //-----------------------------------------------------------------------------------------------
    public static int[] reverse(int[] array){
        int[] tempArray = new int[array.length];
        for(int i = array.length; i > 0; i--){
            tempArray[array.length - i] = array[i-1];
        }
        return tempArray;
    }
    public static int[] reverseWithoutAnotherTab(int[] array){
      int index = array.length -1;
      int halfLength = array.length /2;
      for(int i = 0; i<halfLength; i++){
          int temp = array[i];
          array[i] = array[index -i];
          array[index -i] = temp;
      }
      return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length - 1; i++ ){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }


    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            sortedArray[i] = array[i];

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " = " + array[i]);
        }
    }


}
