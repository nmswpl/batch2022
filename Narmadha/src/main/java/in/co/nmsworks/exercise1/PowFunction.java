package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PowFunction {
    //using pow function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a baseNum: ");
        int baseNum=sc.nextInt();
        System.out.println("enter a power: ");
        int exponent=sc.nextInt();
        System.out.println(Math.pow(baseNum,exponent));

    }
}
