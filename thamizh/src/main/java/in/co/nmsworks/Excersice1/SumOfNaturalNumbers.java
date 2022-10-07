package in.co.nmsworks.Excersice1;

import java.util.Scanner;

//12. Write a program to find the Sum of Natural Numbers using for loop

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter natural number");
        int n= in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            //System.out.println(sum);
        }
        System.out.println("sum of natural no is "+sum);
    }
}
