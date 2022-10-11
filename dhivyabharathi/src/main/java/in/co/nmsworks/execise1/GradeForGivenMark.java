package in.co.nmsworks.execise1;
//2. Write a program to print the Grade for given Mark.
//Mark Slab : 91-100 = S;
//81-90 = A;
//71-80 = B;
//61-70 = C ;
//51-60 = D;
//Every thing else : F
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
