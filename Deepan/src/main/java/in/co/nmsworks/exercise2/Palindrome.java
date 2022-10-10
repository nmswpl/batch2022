package exercise2;

import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

//Checking palindrome
public class Palindrome {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = get.nextLine().toLowerCase();
        String reversedString = "";

        for(int i= str.length()-1; i>=0;i--)
        {
            char ch = str.charAt(i);
            reversedString += ch;
        }

        if(str.equals(reversedString))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
