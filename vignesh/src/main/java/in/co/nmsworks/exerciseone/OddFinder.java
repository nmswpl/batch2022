package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class OddFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int oddCounter = 0;
        for (int element : arr1) {
            if (element % 2 != 0) {
                oddCounter++;
            }
        }
        System.out.println("Odd elements : " + oddCounter);
    }
}


//  12. Given an array of integers, Write a Program to print number of odd elements.