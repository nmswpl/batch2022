package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Positive or negative
public class PositiveOrNegative
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = S.nextInt();

        if(number > 0)
        {
            System.out.println(number+" is positive");
        }
        else
        {
            System.out.println(number+" is negative");
        }
    }
}
