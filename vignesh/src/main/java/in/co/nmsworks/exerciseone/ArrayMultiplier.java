package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class ArrayMultiplier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        System.out.println("Second Array");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]*arr2[i] + "  ");
        }
    }

}


//  3. Write a program to multiply two arrays of same size element-by-element.