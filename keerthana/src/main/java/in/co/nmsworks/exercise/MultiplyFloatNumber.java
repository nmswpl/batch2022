/*3. Write a program to Multiply Two Floating-Point Numbers
The product is: 3.0*/

package in.co.nmsworks.exercise;

import java.util.Scanner;

public class MultiplyFloatNumber
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        float no1= input.nextFloat();
        System.out.println("Enter second number");
        float no2= input.nextFloat();
        float result=no1*no2;
        System.out.println("The Product is:"+result);
    }
}
