package in.co.nmsworks.exercise2;

import java.util.Scanner;
// Print Grade for the Entered Mark
public class GetGrade
{
    public static void main(String[] args)
    {
        int mark = 90;
        if (mark >= 91 && mark <= 100)
        {
            System.out.println("Your Grade is 'S'");
        }
        else if (mark >= 81 && mark <= 90)
        {
            System.out.println("Your Mark Grade is 'A'");
        }
        else if (mark >= 71 && mark <= 80)
        {
            System.out.println("Your Mark Grade is 'B'");
        }
        else if (mark >= 61 && mark <= 70)
        {
            System.out.println("Your Mark Grade is 'C'");
        }
        else if (mark >= 51 && mark <= 60)
        {
            System.out.println("Your Mark Grade is 'D'");
        }
        else
        {
            System.out.println("Your Mark Grade is 'F'");
        }
    }
}
