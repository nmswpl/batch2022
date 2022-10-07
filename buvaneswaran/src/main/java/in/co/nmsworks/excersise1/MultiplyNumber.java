package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class MultiplyNumber
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Float Number :");
        float a= scanner.nextFloat();
        scanner.nextLine();
        float b= scanner.nextFloat();
        scanner.nextLine();
        float sum;
        sum=a*b;
        System.out.println("The sum is :" + sum);
    }
}
