//a program for to print the grade for the respective marks(2)

package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        System.out.println("Enter your Mark:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>91 && n<=100){
            System.out.println("S GRADE");
        }
        else if (n>81 && n<=90) {
            System.out.println("A GRADE");
        }
        else if (n > 71 && n <= 80) {
            System.out.println("B GRADE");
        }
        else if (n > 61 && n <= 70) {
            System.out.println("C GRADE");
        }
        else if (n>51 && n<=60) {
            System.out.println("D GRADE");
        }
        else{
            System.out.println("F GRADE");
        }


    }
}