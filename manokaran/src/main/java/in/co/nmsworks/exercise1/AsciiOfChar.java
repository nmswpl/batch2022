package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Ascii Of Character
public class AsciiOfChar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter char : ");
        char character = scanner.next().charAt(0);
        int ascii = (int) character;
        System.out.println("Ascii value of " + character + " is " + ascii);
    }
}
