package in.co.nmsworks.training.excercise1;

import java.util.Scanner;

public class IntegerPrint {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("You Entered  : " + num);
    }
}
