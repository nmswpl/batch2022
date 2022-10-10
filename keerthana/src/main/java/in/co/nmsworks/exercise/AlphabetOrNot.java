/*
11. Write a program to Check Alphabet using if else
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class AlphabetOrNot
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter :");
        char ch=input.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
        {
            System.out.println(ch+" is an Alphabet");
        }
        else
        {
            System.out.println(ch+" is not an Alphabet");
        }

    }
}
