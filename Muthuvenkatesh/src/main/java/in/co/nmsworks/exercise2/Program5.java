// 5. Write a program to check if a given Character is a Vowel or Consonant.
package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character");
        char ch = input.next().charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
            System.out.println(ch + " is an vowel");
        }
        else{
            System.out.println(ch + " is an consonant");
        }
    }
}
