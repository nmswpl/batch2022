package in.co.nmsworks.excercise3;

import java.util.Scanner;

public class TriangleAlphabetPattern
{
    public static void main(String[] args)
    {
        int row;
        char ch='a';
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        row= inputObject.nextInt();
        for ( int i=0; i<row; i++)
        {
            for ( int j=0;j<=i; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
