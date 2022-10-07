package in.co.nmsworks.training.practice;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter two numbers");
       // System.out.println("Before swapping");
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        System.out.println("Before swapping");
        System.out.println("first number="+number1 );
        System.out.println("second number="+number2);
        int temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("after swapping" );
        System.out.println("first number="+number1 );
        System.out.println("second number="+number2);


    }
}
