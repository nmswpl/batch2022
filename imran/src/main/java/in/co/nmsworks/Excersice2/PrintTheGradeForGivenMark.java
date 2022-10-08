package in.co.nmsworks.Excersice2;

import java.util.Scanner;

public class PrintTheGradeForGivenMark {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = inp.nextInt();

        if(mark > 90 && mark <= 100)
        {
            System.out.println("Your grade is  : S" );
        }
        else if (mark > 80 && mark <= 90)
        {
            System.out.println("Your grade is  : A" );
        }
        else if (mark > 70 && mark <= 80)
        {
            System.out.println("Your grade is  : B" );
        }
        else if (mark > 60 && mark <= 70)
        {
            System.out.println("Your grade is  : C" );
        }
        else if (mark > 50 && mark <= 60)
        {
            System.out.println("Your grade is  : D" );
        }
        else
        {
            System.out.println("Your grade is  : S" );
        }
    }
}
