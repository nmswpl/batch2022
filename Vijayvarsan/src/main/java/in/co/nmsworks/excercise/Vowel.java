package in.co.nmsworks.excercise;

import java.util.Scanner;

public class Vowel {
    //8. Write a program to Check whether an alphabet is vowel or consonant using if..else
    //statement

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER CHAR FOR FIND THAT IS VOWEL OR CONSONANT");

        char ch = scan.next().charAt(0);

        if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("vowel");
        else
            System.out.println(("the character is consonant"));
    }
}
