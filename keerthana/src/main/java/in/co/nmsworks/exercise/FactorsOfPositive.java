/*22. Write a program to find Factors of a Positive Integer

 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FactorsOfPositive
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no:");
        int no= input.nextInt();
        int factors=0;
        System.out.println("Factors of "+no+" is:");
        for(int i=1;i<=no;i++)
        {

            if(no%i==0)
            {
                factors = i;
                System.out.print(factors+" ");
            }
        }


    }
}
