package in.co.nmsworks.exercise1;
//vowel or consonant

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);

        if (ch == 'a'||ch== 'e' || ch== 'i' || ch== 'o' ||ch== 'u'||ch=='A'||ch=='E' ||ch=='I'||ch== 'O'||ch=='U')
        {
            System.out.println(ch + "is a vowel");
        }
        else
        {
            System.out.println(ch + "is a constant");
        }
    }
}
