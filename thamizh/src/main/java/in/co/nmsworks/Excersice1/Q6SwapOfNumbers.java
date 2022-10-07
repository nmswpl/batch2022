package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class Q6SwapOfNumbers {

    // System.out.println("a :"+a);

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter a :");
        int a=in.nextInt();
        System.out.println("enter b :");
        int b= in.nextInt();

        System.out.println("----Before Swap-----");
        System.out.println("a :"+a);
        System.out.println("b :"+b);

        int c=a;
        a=b;
        b=c;

        System.out.println("-------------------");

        System.out.println("After swapping");
        System.out.println("a :"+a);
        System.out.println("b :"+b);

    }
}
