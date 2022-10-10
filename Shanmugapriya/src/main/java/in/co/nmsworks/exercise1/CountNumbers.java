package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Count numbers in the given input
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
