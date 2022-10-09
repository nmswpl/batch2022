package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class LargestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) { // 1 3 5 123 4

            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }

}

//  17. Given an array of integer, Write a Program to find the largest element in the given array.
