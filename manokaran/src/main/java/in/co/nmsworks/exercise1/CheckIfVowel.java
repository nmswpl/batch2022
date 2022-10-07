package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Check Character id Vowel
public class CheckIfVowel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character : ");
        char character = scanner.next().toLowerCase().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
        {
            System.out.println(character + " is a Vowel");
        }
        else
        {
            System.out.println(character + " is a Consonant");
        }
    }
}
