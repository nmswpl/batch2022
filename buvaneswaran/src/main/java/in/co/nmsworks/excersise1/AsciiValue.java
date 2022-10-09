package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class AsciiValue
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Charecter :");
        char ch = scanner.next().charAt(0);   ;
        int ascii = ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
