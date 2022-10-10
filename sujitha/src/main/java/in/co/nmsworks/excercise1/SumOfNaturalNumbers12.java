/*12. Write a program to find the Sum of Natural Numbers using for loop*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class SumOfNaturalNumbers12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n= sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
          sum=sum+i;
        }
        System.out.println("sum is "+sum);
    }
}
