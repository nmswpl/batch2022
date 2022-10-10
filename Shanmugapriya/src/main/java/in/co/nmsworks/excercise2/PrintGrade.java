package in.co.nmsworks.excercise2;

import java.util.Scanner;
//Print grade for marks
public class PrintGrade
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the mark :");
        int mark = S.nextInt();

        if(mark >= 91 && mark <= 100)
            System.out.println("The Grade of the Student is S");
        else if(mark >= 81 && mark <= 90)
            System.out.println("The Grade of the Student is A");
        else if(mark >= 71 && mark <= 80)
            System.out.println("The Grade of the Student is B");
        else if(mark >= 61 && mark <= 70)
            System.out.println("The Grade of the Student is C");
        else if(mark >= 51 && mark <= 60)
            System.out.println("The Grade of the Student is D");
        else
            System.out.println("The Grade is F");

    }
}
