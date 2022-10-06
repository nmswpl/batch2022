package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PowerCalculator2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Number :");
        double base = sc.nextInt();
        System.out.println("Enter the Power Number : ");
        double power = sc.nextInt();
        System.out.print("Answer : " + ((int)Math.pow(base,power)) );

    }
}

//  20. Calculate the power of a number using pow() function