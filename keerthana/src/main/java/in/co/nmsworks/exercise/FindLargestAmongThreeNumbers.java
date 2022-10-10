/*
9. Write a program to Find Largest Among three numbers using if..else statement.
 */

package in.co.nmsworks.exercise;

import java.awt.*;
import java.util.Scanner;

public class FindLargestAmongThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first no:");
        int no1= input.nextInt();
        System.out.println("Enter the second no:");
        int no2= input.nextInt();
        System.out.println("Enter the third no:");
        int no3= input.nextInt();

        if(no1>no2&&no1>no3)
        {
            System.out.println("The largest number is: "+no1);
        }
        else if(no2>no1&&no2>no3)
        {
            System.out.println("The largest number is: "+no2);

        }
        else {

            System.out.println("The largest number is: " + no3);
        }
    }
}
