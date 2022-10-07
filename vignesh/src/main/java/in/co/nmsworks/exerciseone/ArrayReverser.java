package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class ArrayReverser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        String[] arr1 = new String[n];
        System.out.println("First Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }
        for (int i = arr1.length-1 ;i >= 0; i--){
            System.out.print(arr1[i] + "  ");
        }

    }
}

//  14. Given an array of String, Write a Program to reverse the array and print.