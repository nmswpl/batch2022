package in.co.nmsworks.execise1;

import java.util.Scanner;

public class GradeForGivenMark
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Mark");
        int Mark = in.nextInt();

        if(Mark>=91 && Mark<=100)
        {
            System.out.println("S Grade and Mark is : "+Mark);
        } else if (Mark>=81 && Mark<=90)
        {
            System.out.println("A Grade and Mark is : "+Mark);
        } else if (Mark>=71 && Mark<=80) 
        {
            System.out.println("B Grade and Mark is : "+Mark);
        } else if (Mark>=61 && Mark<=70) 
        {
            System.out.println("C Grade and Mark is : "+Mark);
        } else if (Mark>=51 && Mark<=60)
        {
            System.out.println("D Grade and Mark is : "+Mark);
        }
        else
        {
            System.out.println(" F Grade and Mark is : "+Mark);
        }
    }

}
