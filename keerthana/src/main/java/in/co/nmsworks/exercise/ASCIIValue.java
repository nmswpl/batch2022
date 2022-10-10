/*4. Write a program to Find ASCII value of a character*/


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class ASCIIValue
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a character:");
        char inp= input.next().charAt(0);
        int a= inp;
        System.out.println("The ASCII value of character:"+a);
    }
}
