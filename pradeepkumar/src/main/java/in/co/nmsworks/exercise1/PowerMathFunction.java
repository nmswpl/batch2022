package in.co.nmsworks.exercise1;

import java.util.Scanner;

//power of a number using math function
public class PowerMathFunction {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base");
        int base= scanner.nextInt();

        System.out.println("Enter the power");
        int power= scanner.nextInt();

        double result=0;
        for (int i = 0; i <=power ; i++) {
             result=  Math.pow(base,power);

        }
        System.out.println("The power of " + base + "=" + result);
    }
}
