/*18. Given an array of integers and int x, Write a Program to print no of occurance of x in
the array

 */

package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class NoOfOccurence
{
    public static void main(String[] args)
    {
        int[] arrOfIntegers={1,2,3,4,3,4,5,6,2,4,5,7,3,6,2};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to check no of occurence");
        int no= input.nextInt();
        int count=0;
        for(int i=0;i<arrOfIntegers.length;i++)
        {
            if(no==arrOfIntegers[i])
            {
                count++;
            }

        }
        System.out.println("No of Occurence of "+no+" is: "+count);

    }
}
