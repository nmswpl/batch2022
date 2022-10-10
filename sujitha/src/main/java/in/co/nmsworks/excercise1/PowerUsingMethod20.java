/*20. Calculate the power of a number using pow() function*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class PowerUsingMethod20
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        int base= sc.nextInt();
        System.out.println("enter power");
        int power= sc.nextInt();
        double result=Math.pow(base,power);
        System.out.println("answer is: "+result);

    }
}
