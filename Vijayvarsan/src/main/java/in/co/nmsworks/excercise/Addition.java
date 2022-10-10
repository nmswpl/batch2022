package in.co.nmsworks.excercise;

import java.util.Scanner;

public class Addition {

    //2.Write a Program to Add Two Integers.
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("ENTER TWO VALUE FOR ADDITION ");
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        System.out.println("ADDED VALUE IS = "+(value1+value2));
}
}
