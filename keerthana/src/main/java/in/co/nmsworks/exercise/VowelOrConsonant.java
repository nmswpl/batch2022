/*
8. Write a program to Check whether an alphabet is vowel or consonant using if..else
statement
 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a character:");
        char inp=input.next().charAt(0);
        if(inp=='a'||inp=='A'||inp=='e'||inp=='E'||inp=='i'||inp=='I'||inp=='o'||inp=='O'||inp=='u'||inp=='U')
        {
            System.out.println("The given character: "+inp+" is vowel");
        }
        else
        {
            System.out.println("The given character: "+inp+" is consonant");

        }


    }
}
