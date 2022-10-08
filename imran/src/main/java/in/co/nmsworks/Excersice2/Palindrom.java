package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class Palindrom
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = inp.nextLine();
        String reverse = "";
        char ch;
        for (int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            reverse = ch + reverse  ;
        }
       if( str.equals(reverse))
       {
           System.out.println(str + " is palindrome");
       }
       else
       {
           System.out.println(str +" is not a  palitndrom");
       }

    }
}
