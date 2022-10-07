package in.co.nmsworks.excercise1;

import java.util.Scanner;

// check alphabet
public class Program11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char l = in.next().charAt(0);
        char c = Character.toLowerCase(l);

        if(c >= 'a' && c <= 'z') {
            System.out.println(l + " is an alphabet");
        }
        else {
            System.out.println(l + " is not an alphabet");
        }
    }
}
