package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base= scanner.nextInt();
        long temp=1;

        System.out.println("Enter the exponent :");
        int power= scanner.nextInt();

        for (int i = 1; i <=power ; i++) {
            temp =temp * base;
        }
        System.out.println(temp);
    }
}
