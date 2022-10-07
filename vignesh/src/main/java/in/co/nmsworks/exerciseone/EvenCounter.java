package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class EvenCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int evenCounter = 0;
        for (int element : arr1) {
            if (element % 2 != 0) {
                evenCounter++;
            }
        }
        System.out.println("Even elements : " + evenCounter);

    }

}

//  15. Given an array of integers, Write a Program to count and print even elements.
