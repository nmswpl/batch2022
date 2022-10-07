package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Frequency of a Character in a String
public class FrequencyOfChar
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Statement : ");
        String statement = scanner.nextLine().toLowerCase();
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < statement.length(); i ++)
        {
            if (character == statement.charAt(i))
            {
                count ++;
            }
        }
        System.out.println("No of character " + character + " in statement is : " + count) ;
    }

}
