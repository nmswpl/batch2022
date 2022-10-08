package in.co.nmsworks.excercise;

import java.util.Scanner;

public class Addition {

    //2.Write a Program to Add Two Integers.
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("ENTER TWO VALUE FOR ADDITION ");
        double value1 = scan.nextDouble();
        double value2 = scan.nextDouble();
        System.out.println("ADDED VALUE IS = "+(value1+value2));
}
}
