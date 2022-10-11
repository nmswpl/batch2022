package in.co.nmsworks.execise1;

import java.util.Scanner;
//19. Given a String, Write a program to find if the string is palindrome or Not.
public class PalindromOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String CheckString = in.nextLine();
        StringBuilder Reversestr = new StringBuilder();
        Reversestr.append(CheckString);
        Reversestr.reverse();
        System.out.println(Reversestr);
        if(CheckString.equals(Reversestr))
        {
            System.out.println("Given String is Not Palindrome");
        }
        else
        {
            System.out.println("Given String is Plaindrome");
        }


    }
}
