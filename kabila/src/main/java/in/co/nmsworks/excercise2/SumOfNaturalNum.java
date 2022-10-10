package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class SumOfNaturalNum
{
    public static void main(String[] args)
    {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = numbers.nextInt();
        int i, sum = 0;

            for (i = 1; i <= number ; i++)
            {
                sum = sum + i;
            }

            System.out.println("Sum of First 10 Natural Numbers is = " + sum);

        }
    }


