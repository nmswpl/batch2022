package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PositionPrinter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Size : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("First Array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the search element");
        int searchElement = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == searchElement) {
                System.out.println(i);
                break;
            } else if (i == n-1) {
                System.out.println("-1");
            }
        }

    }
}

//      4. Write a program to print the position of given element in an array. If not present, print -1