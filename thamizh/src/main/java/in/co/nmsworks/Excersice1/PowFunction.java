package in.co.nmsworks.Excersice1;

import java.util.Scanner;
//import java.math.

public class PowFunction {


    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter number ");
        double number=in.nextDouble();
        System.out.println("enter power");
        double power=in.nextDouble();


        System.out.println(Math.pow(number,power));
    }
}
