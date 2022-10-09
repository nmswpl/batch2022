package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Problem15
{
    public static void palindrome()
    {

        String rev="";
        Scanner in = new Scanner(System.in);
            System.out.println("Enter a string ");
           String str= in.nextLine();
            int len = str.length();
            for ( int i = len- 1; i >= 0; i-- )
            {
                rev = rev + str.charAt(i);
            }
            if (str.equals(rev))
            {
                System.out.println(" Is a palindrome.");
            }

            else {
                System.out.println(" Isn't a palindrome.");
            }

    }

    public static void main(String[] args)
    {
        palindrome();
    }
}
