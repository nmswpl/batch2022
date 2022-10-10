/*25. Write a program to count vowels, consonants, digits, and spaces*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class CountVowelConsonants25
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a statement: ");
        String statement=sc.nextLine();
        char[] stmt=statement.toCharArray();
        int vowelCount=0;
        int consonantCount=0;
        int spaceCount=0;
        int digitCount=0;
        for (int i=0;i<statement.length();i++)
        {
            if (stmt[i] == 'a' || stmt[i] == 'e' || stmt[i] == 'i' || stmt[i] == 'o' || stmt[i] == 'u')
            {
                vowelCount++;
            }

            else if (stmt[i]>='a' && stmt[i]<='z'||stmt[i]>='A' && stmt[i]<='Z')
            {
                consonantCount++;
            }
            else if (stmt[i]==' ')
            {
                spaceCount++;
            }
            else {
                digitCount++;
            }

        }
        System.out.println("no of vowels in statement: "+vowelCount);
        System.out.println("no of spaces in statement: "+spaceCount);
        System.out.println("no of digits in statement: "+digitCount);
        System.out.println("no of consonant in statement: "+consonantCount);
    }
}
