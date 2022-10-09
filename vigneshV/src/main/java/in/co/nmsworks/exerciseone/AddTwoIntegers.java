package in.co.nmsworks.exerciseone;

import  java.util.Scanner;
public class AddTwoIntegers {
    public static void main(String[] args) {
        int input1,Input2;
        Scanner inputObject=new Scanner(System.in);
        System.out.println("Enter two numbers");
        input1=inputObject.nextInt();
        Input2=inputObject.nextInt();
        System.out.println("The sum is: "+(input1+Input2));
    }
}
