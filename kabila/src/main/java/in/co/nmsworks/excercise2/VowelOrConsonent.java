package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args)
    {
        Scanner vow=new Scanner(System.in);
        System.out.println("enter the alphabet");
        char ch= vow.next().charAt(0);
        //char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
