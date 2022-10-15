package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program19
{
    public static void primeNumberUsingLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println(num + " is a prime number");
        } else
        {
            System.out.println(num + "  not a prime number");
        }
    }

    public static void main(String[] args)
    {
        primeNumberUsingLoop();
    }

}
