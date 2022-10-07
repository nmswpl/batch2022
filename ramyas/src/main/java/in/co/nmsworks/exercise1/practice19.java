package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class practice19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A BASE: ");
        int base = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER A POWER: ");
        int expo = sc1.nextInt();

        int power = 1;

        for (int i = 1; i <= expo ; i++)
        {
            power *= base;
        }
        System.out.println("ANSWER = " +power);
    }
}
