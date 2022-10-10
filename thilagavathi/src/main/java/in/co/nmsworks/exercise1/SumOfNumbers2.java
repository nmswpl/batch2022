package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        int a,b;
        int c;
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum of the numbers is:"+c);
    }

}

