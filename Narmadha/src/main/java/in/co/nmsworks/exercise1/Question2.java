package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        //Program to Add Two Integers
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int value=input.nextInt();
        int value1= input.nextInt();
        int sum=value+value1;
        System.out.println("sum is "+sum);

    }
}
