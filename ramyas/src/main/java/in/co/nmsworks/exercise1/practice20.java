package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class practice20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A BASE: ");
        int base = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER A POWER: ");
        int expo = sc1.nextInt();

        double power = Math.pow(base, expo);
        System.out.println("ANSWER = " +power );

    }
}

