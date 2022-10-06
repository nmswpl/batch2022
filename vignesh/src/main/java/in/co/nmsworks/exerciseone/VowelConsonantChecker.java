package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class VowelConsonantChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet :");
        char ch = sc.next().charAt(0);
        if( ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u'){
            System.out.println("It is vowel");
        }
        else {
            System.out.println("It's a consonant");
        }


    }

}

//  8. Write a program to Check whether an alphabet is vowel or consonant using if else statement