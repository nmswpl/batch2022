package in.co.nmsworks.excercise2;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CharacterVowelOrConsonant {
    public static void main(String[] args) {
        char searchAlphabet;
        System.out.print("Enter the Alphabet: ");
        Scanner inputObject=new Scanner(System.in);
        searchAlphabet=inputObject.next().charAt(0);
        Set<Character> vowelSet=new LinkedHashSet<>();
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for (int i=0; i<vowels.length; i++)
        {
            vowelSet.add(vowels[i]);
        }
        if (vowelSet.contains(searchAlphabet))
        {
            System.out.println("Vowel");
        }
        else
        {
            if ( searchAlphabet>='a'&& searchAlphabet<='z' || searchAlphabet>='A'&& searchAlphabet<='Z' )
            {
                System.out.println("Consonant");
            }
            else
            {
                System.out.println("It is special character");
            }
        }
    }
}
