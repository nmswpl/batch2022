package in.co.nmsworks.exerciseone;

import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args) {
        char ascii;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the character:");
        ascii=input.next().charAt(0);
        int asciiValue=ascii;
        System.out.println(ascii+" Ascii value is:"+asciiValue);
    }
}
