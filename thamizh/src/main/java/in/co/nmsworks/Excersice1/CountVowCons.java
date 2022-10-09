package in.co.nmsworks.Excersice1;

import java.util.Scanner;

public class CountVowCons {

    //25. Write a program to count vowels, consonants, digits, and spaces

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter a Statement");

        String statement=in.nextLine();

        System.out.println(statement);

        int v=0;
        int c=0;
        int d=0;
        int s=0;

        for(int i=0;i<statement.length();i++)
        {
            if(statement.charAt(i)>=48 && statement.charAt(i)<=57)
            {
                d++;
            }
            if (statement.charAt(i)==32)
            {
                s++;
            }
            if(statement.charAt(i)=='a' || statement.charAt(i)=='e' ||statement.charAt(i)=='i' ||statement.charAt(i)=='o' || statement.charAt(i)=='u'
            ||statement.charAt(i)=='A' || statement.charAt(i)=='E' ||statement.charAt(i)=='I' ||statement.charAt(i)=='O' || statement.charAt(i)=='U')
            {
                v++;
            }
            else
            {
                c=statement.length()-(v+d+s);
            }
        }
        System.out.println("V :"+v);
        System.out.println("C :"+c);
        System.out.println("N :"+d);

        System.out.println("S :"+s);
    }
}
