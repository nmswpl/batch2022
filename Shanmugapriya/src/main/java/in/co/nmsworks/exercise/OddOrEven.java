package in.co.nmsworks.training.program.exercise;

import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = S.nextInt();

        if(number % 2 == 0)
        {
            System.out.println(number+" is even");
        }
        else
            System.out.println(number+" is odd");
    }
}
