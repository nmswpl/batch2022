//to multiply two float numbers

package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class MultiplyNumbers3 {
    public static void main(String[] args) {
        float mul=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1:");
        float a=sc.nextFloat();
        System.out.println("Enter the number2:");
        float b=sc.nextFloat();
        mul = a * b;
        System.out.println(mul);


    }
}
