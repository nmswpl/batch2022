package exercise2;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int num)
    {
        if(num>0)
        {
            return num * factorial(num - 1);
        }
        else
            return 1;
    }


    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = get.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of "+num+ " is " +result);

    }
}
