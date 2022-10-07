package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //program to Multiply Two Floating-Point Numbers
        Scanner input=new Scanner(System.in);
        System.out.println("enter float values : ");
        float value1= input.nextFloat();
        float value2=input.nextFloat();
        float product=value1*value2;
        System.out.println("The product is " +product);

    }
}
