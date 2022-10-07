package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class AddingTwoInteger
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Two Number :");
        int a= scanner.nextInt();
        scanner.nextLine();
        int b= scanner.nextInt();
        scanner.nextLine();
        int sum;
        sum=a+b;
        System.out.println("The sum is :" + sum);
    }
}
