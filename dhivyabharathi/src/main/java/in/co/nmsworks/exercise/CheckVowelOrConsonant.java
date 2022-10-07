package in.co.nmsworks.exercise;

import java.util.Scanner;

public class CheckVowelOrConsonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter check value ");
        char checkvalue = in.next().charAt(0);

        switch (checkvalue)
        {
            case 'a' :
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'e':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'i':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'o':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'u':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'A': {
                System.out.println("Given element is Vowel " + checkvalue);
                break;
            }
            case 'E':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'I':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }
            case 'O':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }

            case 'U':
            {
                System.out.println("Given element is Vowel "+checkvalue);
                break;
            }

            default:
            {
                System.out.println("Given element is not a vowel");
            }
        }
    }
}
