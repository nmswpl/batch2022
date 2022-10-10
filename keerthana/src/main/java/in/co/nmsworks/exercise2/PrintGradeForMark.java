/*2. Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F

 */


package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PrintGradeForMark
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter mark:");
        float mark=input.nextFloat();
        if(mark>90&&mark<=100)
        {
            System.out.println("Grade S");
        }
        else if(mark>80&&mark<=90)
        {
            System.out.println("Grade A");
        } else if (mark>70&&mark<=80)
        {
            System.out.println("Grade B");

        } else if (mark>60&&mark<=70)
        {
            System.out.println("Grade C");
        } else if (mark>50&&mark<=60)
        {
            System.out.println("Grade D");
        }
        else if(mark>100)
        {
            System.out.println("Mark is not valid");
        }
        else {
            System.out.println("F");
        }
    }

}
