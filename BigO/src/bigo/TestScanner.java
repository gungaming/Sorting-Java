/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author int320
 */
public class TestScanner {

    public static void main(String args[]) {
        TestScanner ob = new TestScanner();
        int array[] = new int[4];//creating an integer array
        ob.inputArray(array, 4);//taking input in the array
        ob.insertionSort(array, 4);//sorting the array with the desired sorting algorithm
        ob.printArray(array, 4);//printing the array after sorting
    }

    void insertionSort(int array[], int length) {
        for (int i = 1; i < length; i++) {
            int temporary = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > temporary; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temporary;
        }
    }

    void inputArray(int array[], int length) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input " + length + " (integer) elements: ");

        for (length--; length >= 0; length--) {
            array[length] = scanner.nextInt();
        }

    }

    void printArray(int array[], int length) {

        System.out.print("The elements of the given array are: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        
        long begin = System.currentTimeMillis();
        System.out.println("\nDuration : " + (System.currentTimeMillis() - begin) + " milliseconds");
    }
}
