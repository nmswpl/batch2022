package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program3
{
    public static void vowelOrConsonant()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Alphabet is");
        char ch= sc.next().charAt(0);
        if(ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'||ch =='A' || ch =='E' ||ch =='I' ||ch =='O' ||ch =='U')
        {
            System.out.println( ch + " is vowel ");
        }
        else {
            System.out.println(ch + " is Consonant ");
        }

    }

    public static void main(String[] args)
    {
        vowelOrConsonant();
    }
}
