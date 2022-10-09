package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class FactorialWhile
{
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();scanner.nextLine();
        int num=5;
        int i=1;
        int fact=1;
        while (i<=num)
        {
            fact*=i;
            i++;
        }
        System.out.println("Factorial of number is :" + fact);
    }
}
