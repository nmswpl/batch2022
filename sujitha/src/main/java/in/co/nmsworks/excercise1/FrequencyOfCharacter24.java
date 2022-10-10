/*24. Write a program to find Frequency of Character*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class FrequencyOfCharacter24
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a statement: ");
        String statement=sc.nextLine();
        char[] stmt=statement.toCharArray();
        System.out.println("enter a character: ");
        char occurrenceCharacter=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<statement.length();i++)
        {
            if(occurrenceCharacter==stmt[i])
            {
                count++;
            }
        }
        System.out.println("occurrence of character "+occurrenceCharacter+" is "+count);
    }
}
