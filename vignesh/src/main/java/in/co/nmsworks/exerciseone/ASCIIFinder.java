package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class ASCIIFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character :");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value :"+ ((int) ch));

    }
}

// 4. Write a program to Find ASCII value of a character