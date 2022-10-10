package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class AlphabetOrNot11 {
    public static void main(String[] args) {
        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch<= 'z') && (ch>= 'A' && ch<= 'Z')){
            System.out.println(ch + " is a Alphabet");
        }
        else{
            System.out.println(ch+ " is not an Alphabet");
        }
    }
}
