package exercise2;

import java.util.Scanner;

public class GradeChecker {

    public static void showGrade(int mark)
    {

            if( mark > 91 && mark < 100)
                System.out.println("Grade S");
            else if(mark > 81 && mark <90)
                System.out.println("Grade A");
            else if (mark > 71 && mark < 80 )
                System.out.println("Grade B");
            else if(mark > 61 && mark < 70)
                System.out.println("Grade C");
            else if(mark > 51 && mark < 60)
                System.out.println("Grade D");
            else
                System.out.println("Fail");

    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int mark = get.nextInt();

        showGrade(mark);
    }
}
