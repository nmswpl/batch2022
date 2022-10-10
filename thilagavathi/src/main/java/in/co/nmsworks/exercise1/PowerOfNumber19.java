//power of a number using for loop(19)

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PowerOfNumber19 {
    public static void main(String[] args) {
        int number, i, exponent;
        long power = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("  Enter Number : ");
        number = sc.nextInt();

        System.out.print("  Enter the Exponent Value : ");
        exponent = sc.nextInt();

        for(i = 1; i <= exponent; i++)
        {
            power = power * number;
        }
        System.out.println(" The Final result of " + number + " power " + exponent + " = " + power);
    }
}


