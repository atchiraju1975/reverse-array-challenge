package academy.learnprogramming;

import java.util.Scanner;

public class ReverseTheArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arraySize = 0;
        System.out.println("Enter Array Size : ");
        arraySize = scanner.nextInt();
        scanner.nextLine();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = 0;}
        System.out.println("Enter " + arraySize + " Integers");
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int[] outputArray = new int[arraySize];

        outputArray = reverseArray(inputArray, inputArray.length);
        System.out.println("Printing the array in reverse Order :");
        for (int i = 0; i <outputArray.length;i++){
            System.out.println("Array Element "+i+" : "+outputArray[i]);
        }

    }

    public static int[] reverseArray ( int[] originalArray, int originalArraySize){
        int[] reversedArray = new int[originalArraySize];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = 0;
        }
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[reversedArray.length - (i+1)] = originalArray[i];
        }
        return reversedArray;
    }

}
