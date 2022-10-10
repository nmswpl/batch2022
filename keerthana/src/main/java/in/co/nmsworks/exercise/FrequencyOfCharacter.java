/*24. Write a program to find Frequency of Character

 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FrequencyOfCharacter
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str= "This is awesome";
        System.out.println("Enter the char:");
        char c=input.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                count++;

            }
        }
        System.out.println("Ocuurence of "+c+" is: "+count );
    }
}
