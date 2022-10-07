package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        //program to Check Alphabet using if else
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println(ch + " is an alphabet");
        }else{
            System.out.println(ch + " is not an alphabet");
        }
    }
}
