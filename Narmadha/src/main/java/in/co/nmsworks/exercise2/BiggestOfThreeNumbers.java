package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
//program to print the biggest of the 3 numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the numbers : ");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println(num1 + "is biggest number");
        }
        else if (num2>num1 && num2>num3)
        {
            System.out.println(num2 + " is biggest number");

        }
        else{
            System.out.println(num3 + " is biggest number");
        }


    }
}
