package in.co.nmsworks.exercisetwo;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        if(marks>90 && marks<=100)
            System.out.println("GRADE-S");
        else if(marks>80 && marks<=90)
            System.out.println("GRADE-A");
        else if(marks>70 && marks<=80)
            System.out.println("GRADE-B");
        else if(marks>60 && marks<=70)
            System.out.println("GRADE-C");
        else if(marks>50 && marks<=60)
            System.out.println("GRADE-D");
        else
            System.out.println("GRADE-F");
    }
}
