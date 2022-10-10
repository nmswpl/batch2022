/*3. Write a program to Multiply Two Floating-Point Numbers*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class FloatMultiplication3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        //float a=6,b=6;
        float c=a*b;
        System.out.println("product is: "+c);
    }
}
