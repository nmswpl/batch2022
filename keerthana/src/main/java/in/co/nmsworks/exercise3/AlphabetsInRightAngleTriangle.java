package in.co.nmsworks.exercise3;

import java.util.Scanner;

public class AlphabetsInRightAngleTriangle
{

        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter no:");
            int no= input.nextInt();
            int a=97;
            for (int i = 0; i <no; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print((char)(a+i)+ " ");
                }
                System.out.println();
            }
        }

}
