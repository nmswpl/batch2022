package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Program13 {
    public static void findOutAlphabet()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);
        if((ch >='A' && ch <= 'Z' ) || (ch >= 'a' && ch <='z' ))
        {
            System.out.println( ch + " is a Alphabet ");
        }
        else {
            System.out.println(ch + " not a Alphabet ");
        }

    }

    public static void main(String[] args) {
        findOutAlphabet();

    }
}
