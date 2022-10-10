/*19. Given a String, Write a program to find if the string is palindrome or Not.
E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome*/
package in.co.nmsworks.exercisesets2;
import java.util.Scanner;

public class PalindromeOrNot19
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String string1=sc.nextLine();

        char[] str1=string1.toCharArray();

        int startIndex=0;
        int endIndex=str1.length-1;
        char temp;

        for(int i=startIndex;i<=endIndex;i++)
        {
            temp=str1[i];
            str1[i]=str1[endIndex];
            str1[endIndex]=temp;
            endIndex--;
        }
        System.out.println(str1);
        String string2= String.valueOf(str1);
       // System.out.println(string2);

        if(string1.equals(string2))
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }


}
