package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Get User Input
public class GetUserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int integer = input.nextInt();
        System.out.println("You Entered : " + integer);
    }
}
