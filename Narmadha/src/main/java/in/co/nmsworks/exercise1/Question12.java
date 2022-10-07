package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        //program to find the Sum of Natural Numbers using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
           sum += i;

        }
        System.out.println(sum);
    }
}
