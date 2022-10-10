package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class VowelOrConsonant8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ch:");
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' ){
            System.out.println( ch+ " is a vowel");
        }
        else{
            System.out.println(ch+ " is a consonant");
        }
    }
}
