package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class Add {
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1= sc.nextInt();
        System.out.println("enter numbr 2:");
        int num2=sc.nextInt();
        int sum=0;
        sum=num1+num2;
        System.out.println("sum of two number is :"+sum);
    }

    public static void main(String[] args) {
        Add add=new Add();
        add.input();
    }
}
