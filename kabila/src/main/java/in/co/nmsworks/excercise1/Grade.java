package in.co.nmsworks.excercise1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //91-100 = S;
        //81-90 = A;
        //71-80 = B;
        //61-70 = C ;
        //51-60 = D;
        //Every thing else : F
        Scanner mark=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks =mark.nextInt();
      //  int marks=80;
        if(marks>=91&&marks<=100)
            System.out.println("grade s");
        else if (marks>=81&&marks<=90)
            System.out.println("grade A");
        else if (marks>=71&&marks<=80)
            System.out.println("grade B");
        else if (marks>=61&&marks<=70)
            System.out.println("grade C");
        else if (marks>=51&&marks<=60)
            System.out.println("grade D");
        else
            System.out.println("grade F");

        }

    }

