/*4. Write a program to Find ASCII value of a character*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class ASCIIValueOfCharacter4
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a character: ");
        char ch=sc.next().charAt(0);
        int asciiValue=(int)ch;
        System.out.println("ASCII value of "+ch+" is "+asciiValue);
    }
}
