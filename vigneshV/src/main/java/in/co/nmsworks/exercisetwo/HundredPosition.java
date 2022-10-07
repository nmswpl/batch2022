package in.co.nmsworks.exercisetwo;

import java.util.Scanner;

public class HundredPosition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        int firstDigit = n/100;
        System.out.println(ones[firstDigit]);

    }
}
