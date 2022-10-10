/*5. Write a program to check if a given Character is a Vowel or Consonant.

 */


package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the char:");
        char ch=input.next().charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                System.out.println(ch + " is a vowel");
            }
        else {
            System.out.println(ch + " is a consonant");
        }





    }
}
