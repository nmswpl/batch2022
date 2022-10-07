package in.co.nmsworks.exercise2;

import java.util.Scanner;

//print the grade in given mark
//91-100 = S; 81-90 = A;
//        71-80 = B; 61-70 = C ;
//        51-60 = D; Every thing else : F
public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark=scanner.nextInt();
        if (mark>=91 && mark<=100)
        {
            System.out.println("Grade = S");
        }
        else if (mark>=81 && mark<=90) {
            System.out.println("Grade = A");
        }
        else if (mark>=71 && mark<=80) {
            System.out.println("Grade = B");

        }
        else if (mark>=61 && mark<=70) {
            System.out.println("Grade = C");

        }
        else if (mark>=51 && mark<=60) {
            System.out.println("Grade = D");

        }
        else
        {
            System.out.println("Fail");
        }

    }
}
