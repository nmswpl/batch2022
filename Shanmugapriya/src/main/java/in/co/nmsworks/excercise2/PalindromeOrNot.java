package in.co.nmsworks.excercise2;

import java.util.Scanner;
//Palindrome or not
public class PalindromeOrNot
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the string to check :");
        String str = S.nextLine();

        String ch = "";

        for( int i = 0; i < str.length(); i++) {
            ch = str.charAt(i) + ch;
            System.out.println(ch);
        }
        if(str.equals(ch))
        {
            System.out.println(ch);
            System.out.println(str + " is palindrome");
        }
        else {
            System.out.println(ch);
            System.out.println(str + " is not a palindrome");
        }

    }

}

