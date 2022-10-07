package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class VowelConsonantFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0);
        if( ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u'){
            System.out.println("It is vowel");
        }
        else {
            System.out.println("It's a consonant");
        }

    }

}
//  5. Write a program to check if a given Character is a Vowel or Consonant.