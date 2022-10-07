package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Array Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print((int)Math.pow(arr1[i],2)+ " ");
        }

    }
}

//  7.Write a program to print the square of every element present in the array.