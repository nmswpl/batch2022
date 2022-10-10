package in.co.nmsworks.exercise1;

import java.util.Scanner;
//Enter and print prime number
public class EnterAndPrintNumber
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = S.nextInt();

        System.out.println("The number is : "+num);

    }
}
