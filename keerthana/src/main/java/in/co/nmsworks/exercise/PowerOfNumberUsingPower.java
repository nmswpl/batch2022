/*
20. Calculate the power of a number using pow() function
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class PowerOfNumberUsingPower
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Base Number:");
        int base=input.nextInt();
        System.out.println("Enter Power Number:");
        int power=input.nextInt();
        int answer= (int) Math.pow(base,power);
        System.out.println("Answer:"+answer);
    }
}
