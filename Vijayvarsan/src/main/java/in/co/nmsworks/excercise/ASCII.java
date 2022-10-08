package in.co.nmsworks.excercise;

import java.util.Scanner;

public class ASCII {
    // 4.Write a program to Find ASCII value of a character
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("FIND THE ASCII VALUE OF THE CHARACTER");
        char ch=scan.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII VALUE IS = "+ascii);
    }
}
