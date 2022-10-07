package in.co.nmsworks.excercise2;

import java.util.Scanner;

// print grade for the given mark
public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mark : ");
        int mark = in.nextInt();

        if(mark > 90 && mark < 101) {
            System.out.println("S grade");
        }
        if(mark > 80 && mark < 91) {
            System.out.println("A grade");
        }
        if(mark > 70 && mark < 81) {
            System.out.println("B grade");
        }
        if(mark > 60 && mark < 71) {
            System.out.println("C grade");
        }
        if(mark > 50 && mark < 61) {
            System.out.println("D grade");
        }
        if(mark <= 50) {
            System.out.println("F grade");
        }

    }
}
