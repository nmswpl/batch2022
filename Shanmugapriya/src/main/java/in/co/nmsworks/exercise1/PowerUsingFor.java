package in.co.nmsworks.exercise1;

import java.util.Scanner;
//power using for loop
public class PowerUsingFor
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the base value ");
        int base = S.nextInt();

        System.out.println("Enter the power :");
        int power = S.nextInt();
        int answer = 1;

        for (int i = 0; i < power; i++)
        {
            answer *= base;
        }
        System.out.println("Answer ="+answer);
    }
}
