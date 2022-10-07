package in.co.nmsworks.training.program.exercise;

import java.util.Scanner;

public class CountNumbers
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();
        int count = 0;

        while(num != 0)
        {
           int value =  num % 10;
           num = num / 10;
           count++;
        }
        System.out.println(count);

    }
}
