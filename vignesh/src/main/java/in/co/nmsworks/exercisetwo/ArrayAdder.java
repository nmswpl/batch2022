package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class ArrayAdder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element : arr1) {
            sum += element;
        }
        System.out.println(sum);
    }
}


//  13. Given an array of integers, Write a Program to find the sum of the elements of the
//array.