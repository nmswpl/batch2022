/*2. Write a Program to Add Two Integers.*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class AdditionOfIntegers2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=a+b;
        System.out.println("sum is: "+c);
    }
}
