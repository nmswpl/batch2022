package in.co.nmsworks.excercise2;

import java.util.Scanner;

// check if a given Character is a Vowel or Consonant
public class Program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char t = in.next().charAt(0);
        char c = Character.toLowerCase(t);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(t + " is vowel");
        }
        else {
            System.out.println(t + " is consonant");
        }
    }
}
