package in.co.nmsworks.excercise;

import java.util.Scanner;

public class FrequencyOfCharacter {
    //24. Write a program to find Frequency of Character
    public static void main(String[] args) {
        String str="This website is awesome.";
        System.out.println("ENTER THE STATEMENT   "+str);
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if ('e'==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("THE NUMBER E IN THIS LINE = "+count);
    }
}
