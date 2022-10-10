/*19. Given a String, Write a program to find if the string is palindrome or Not.

 */


package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PalindromeOrNot
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str= input.next();
        String reverseStr="";
        int strLength=str.length();
        for(int i=(strLength-1);i>=0;i--)
        {
            reverseStr=reverseStr+str.charAt(i);
        }
        if((str.toLowerCase()).equals(reverseStr.toLowerCase()))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
