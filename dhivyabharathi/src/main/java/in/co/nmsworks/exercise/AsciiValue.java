package in.co.nmsworks.exercise;
//4. Write a program to Find ASCII value of a character

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element");
        char element = in.next().charAt(0);
        int n1 = (int)element;
        System.out.println("Ascii value of "+element+" is : "+n1);
    }
}
