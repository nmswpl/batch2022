package in.co.nmsworks.excercise1;

import java.util.Scanner;

// Find an alphabet is vowel or consonant
public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char l = in.next().charAt(0);
        char c = Character.toLowerCase(l);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(l + " is a vowel");
        }
        else {
            System.out.println(l + " is a consonant");
        }
    }
}
