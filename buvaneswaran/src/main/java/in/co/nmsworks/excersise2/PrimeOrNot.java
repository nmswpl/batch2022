package in.co.nmsworks.excersise2;


//Given an integer x, Write a Program to check whether x is Prime or not ?
import java.util.Scanner;

public class PrimeOrNot
{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num = sc.nextInt();sc.nextLine();
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i)
            {
                if (num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
}
