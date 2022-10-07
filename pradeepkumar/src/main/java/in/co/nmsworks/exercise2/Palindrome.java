package in.co.nmsworks.exercise2;
//Given string is palindrome or n0t

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s1 = scanner.next();
        String revString = "";

        String returnString = s1.toLowerCase();
        for (int i=s1.length()-1;i>=0;i--) {
            revString = revString + s1.charAt(i);
            System.out.println(revString);
        }
        if (s1.equals(revString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
