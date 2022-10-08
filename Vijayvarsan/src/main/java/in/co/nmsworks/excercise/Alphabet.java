package in.co.nmsworks.excercise;

import java.util.Scanner;

public class Alphabet {
    //11. Write a program to Check Alphabet using if else
    public static void main(String[] args) {


        char ch = '8';

        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.println(ch + " the value is alphabet");
        }
        else {
            System.out.println(ch +" is not a alphabet");
        }

    }
}
