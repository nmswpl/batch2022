package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Add two integer
public class AddTwoInteger
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int num1 = S.nextInt();

        System.out.println("Enter the second number :");
        int num2 = S.nextInt();

        System.out.println("The sum of two integer is :"+(num1+num2));


    }
}
