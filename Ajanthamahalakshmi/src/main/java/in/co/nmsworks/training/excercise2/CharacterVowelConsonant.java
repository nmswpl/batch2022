package in.co.nmsworks.training.excercise2;

import java.util.Scanner;

public class CharacterVowelConsonant {
    public static void main(String[] args) {
        int ch = 'Z';

        if(ch == 'a'| ch == 'e'| ch == 'i'|ch == 'o'|ch == 'u'|ch == 'A'|ch == 'E'| ch == 'I' | ch == 'O'| ch == 'U')
        {
            System.out.println("enter value is vowel");
        }
        else
        {
            System.out.println("enter value is consonant");
        }
    }
}
