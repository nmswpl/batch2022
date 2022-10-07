package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        //program to Find Factorial of a number using while loop
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :  ");
        int num=sc.nextInt();
        int i=1;
        long factorial=1;
        while(i<=num){
            factorial=factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
