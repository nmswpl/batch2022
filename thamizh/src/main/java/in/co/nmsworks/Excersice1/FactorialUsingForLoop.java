package in.co.nmsworks.Excersice1;

//

import java.util.Scanner;

//13. Write a program to Find Factorial of a number using for loop

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number :");

        int num= in.nextInt();

        int fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
            //System.out.println(fact);
        }
        System.out.println("Factor of "+num +" is "+fact);
    }



}
