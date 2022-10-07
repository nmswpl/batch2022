package in.co.nmsworks.exerciseone;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        int baseNumber,power;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Base Number:");
        baseNumber=s.nextInt();
        System.out.print("Enter Power:");
        power=s.nextInt();
        System.out.println((int)(Math.pow(baseNumber,power)));
    }
}
