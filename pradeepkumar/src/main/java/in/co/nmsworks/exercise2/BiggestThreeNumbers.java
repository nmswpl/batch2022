package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class BiggestThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();

        System.out.println("Enter the second number");
        int n2=sc.nextInt();

        System.out.println("Enter the third number");
        int n3= sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + "is a greatest number");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + "is a greatest number");
        }
        else
        {
            System.out.println(n3 + "is a greatest number");
        }
    }
}
