package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Given a String, Write a program to find if the string is palindrome or Not.
        String reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the string: ");
        String str=sc.next();

        for(int i=str.length()-1;i>=0;i--) {
            reverse = reverse + str.charAt(i);
        }
            if (str.equals(reverse)) {
                System.out.println("entered string is palindrome");
            } else {
                System.out.println("entered string is not a palindrome");
            }



    }
}
