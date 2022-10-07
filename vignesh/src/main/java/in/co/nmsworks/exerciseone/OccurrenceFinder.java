package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class OccurrenceFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Values : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the value : ");
        int key = sc.nextInt();
        int occurrenceCounter = 0;
        for ( int element : arr1 ) {
            if (key == element){
                occurrenceCounter++;
            }
        }
        System.out.println("The element "+ key + " is found "+ occurrenceCounter + " times" );
    }

}

// 18. Given an array of integers and int x, Write a Program to print no of occurance of x in
//the array