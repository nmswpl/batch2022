package in.co.nmsworks.exercise1;

import java.util.Scanner;



public class Program3
{
    public static void floatingPoint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the float numbers : ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();

        float multiply;
        multiply  =a * b;
        System.out.println("The product is : "+ multiply);

    }

    public static void main(String[] args) {
        floatingPoint();

    }
}
