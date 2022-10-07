package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Check the Character is  Alphabet  or Not
public class CheckIsAlphabet
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char character = scanner.next().toLowerCase().charAt(0);
        if (character >= 'a' && character <='z')
        {
            System.out.println(character + " is alphabet");
        }
        else
        {
            System.out.println(character + " is not an alphabet");
        }
    }
}
