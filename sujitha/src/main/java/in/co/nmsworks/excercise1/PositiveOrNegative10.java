/*10. Write a program to Check if a Number is Positive or Negative using if else*/
package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class PositiveOrNegative10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num= sc.nextInt();
        if(num>0)
        {
            System.out.println(num+" is positive");
        }
        else {
            System.out.println(num+" is negative");
        }

    }
}
