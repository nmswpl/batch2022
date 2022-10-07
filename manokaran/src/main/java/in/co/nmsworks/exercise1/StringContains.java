package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Number of Spaces,Vowels,Consonants,numbers in String
public class StringContains
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Statement : ");
        String statement = scanner.nextLine().toLowerCase();
        int vowelsCount = 0;
        int spaces = 0;
        int consonats = 0;
        int numbers = 0;
        for (int i = 0;i < statement.length(); i ++)
        {
            if (statement.charAt(i) == 'a' || statement.charAt(i) == 'e' || statement.charAt(i) == 'i' || statement.charAt(i) == 'o' || statement.charAt(i) == 'u')
            {
                vowelsCount ++;
            }
            else if (statement.charAt(i) == ' ')
            {
                spaces ++;
            }
            else if (statement.charAt(i) >= 'a' && statement.charAt(i) <= 'z')
            {
                consonats ++;
            }
            else if (statement.charAt(i) >= '0' && statement.charAt(i) <= '9')
            {
                numbers ++;
            }
            else {
                continue;
            }
        }
        System.out.println("Vowels : " + vowelsCount);
        System.out.println("Consonants : " + consonats);
        System.out.println("Numbers : " + numbers);
        System.out.println("Spaces : " + spaces);
    }
}
