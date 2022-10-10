/*
19. Calculate the power of a number using a for loop. (E.g : 2 power 3 is 8 [2 x 2 x 2])
 */



package in.co.nmsworks.exercise;

import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Base Number:");
        int base=input.nextInt();
        System.out.println("Enter Power:");
        int power=input.nextInt();
        int product=1;
        for(int i=1;i<=power;i++)
        {
            product=product*base;
        }
        System.out.println("Answer:"+product);
    }
}
