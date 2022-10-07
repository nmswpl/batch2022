package in.co.nmsworks.excersise2;

import java.util.Scanner;

public class GradeForMarks
{
   // 2. Write a program to print the Grade for given Mark.
   public static void main(String[] args)
   {
       //Scanner s =new Scanner(System.in);
       int mark = 99;
       if(91 < mark && mark < 100)
       {
           System.out.println("S grade");
       }
       else if (81< mark && mark <90)
       {
           System.out.println(" A grade");
       }
       else if (71< mark &&  mark < 80)
       {
           System.out.println(" B grade");
       }
       else if (51< mark &&  mark < 60)
       {
           System.out.println(" D grade");
       }
       else
       {
           System.out.println(" Fail");
       }

   }
}
