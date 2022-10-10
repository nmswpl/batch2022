package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PalindromeFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String strReverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {  //str
                strReverse += str.charAt(i);
        }

        if (strReverse.equals(str)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

}

// 19. Given a String, Write a program to find if the string is palindrome or Not.
