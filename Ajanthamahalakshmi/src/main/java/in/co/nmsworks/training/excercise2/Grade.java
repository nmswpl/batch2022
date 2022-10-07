package in.co.nmsworks.training.excercise2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter the mark:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        if(input < 51 )
        {
            System.out.println("Grade is : F");
        }
        else if (input >=51 && input <= 60)
        {
            System.out.println("Grade is : D");
        }
        else if (input >60 && input <= 70)
        {
            System.out.println("Grade is : C");
        }
        else if (input >70 && input <=80)
        {
            System.out.println("Grade is : B");

        } else if (input >80  && input <=90)
        {
            System.out.println("Grade is : A");
        } else if (input > 90 && input <=100)
        {
            System.out.println("Grade is : S");
        }
        else {
            System.out.println("enter a valid mark");
        }
    }
}
