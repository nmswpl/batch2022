package in.co.nmsworks.exercise;

import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st numbers");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd  number");
        int n2 = in.nextInt();
        int n3 = n1+n2;
        System.out.println("The sum is : "+n3);
    }
}
