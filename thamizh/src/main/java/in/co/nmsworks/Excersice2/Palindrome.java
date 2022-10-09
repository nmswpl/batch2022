package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class Palindrome {

    //19. Given a String, Write a program to find if the string is palindrome or Not.

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter string");
        String str= in.nextLine();

    StringBuilder buffer=new StringBuilder(str);

    String result= String.valueOf(buffer.reverse());

        System.out.println(result);

    if(result.equals(str))
    {
        System.out.println(str+" is palindrome");
    }
    else {
        System.out.println(str+"  is not palindrome");
    }


    }
}
