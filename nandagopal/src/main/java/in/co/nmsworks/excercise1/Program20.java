package in.co.nmsworks.excercise1;

import java.util.Scanner;

// power of a number using pow function
public class Program20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base number : ");
        int base = in.nextInt();
        System.out.println("Enter power : ");
        int power = in.nextInt();

        System.out.println("Answer = " + (int) Math.pow(base, power));
    }
}
