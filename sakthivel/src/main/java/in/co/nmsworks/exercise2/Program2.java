package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class Program2
{
    public static void printGrade()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks= sc.nextInt();
        if(marks > 91 && marks <= 100)
        {
            System.out.println(" S Grade ");
        }
        else if (marks < 91 && marks >=81)
        {
            System.out.println(" A Grade ");
        }
        else if (marks < 81 && marks >=71)
        {
            System.out.println(" B Grade ");
        }
        else if (marks < 71 && marks >=61)
        {
            System.out.println(" C Grade ");
        }
        else if (marks < 61 && marks >=51)
        {
            System.out.println(" D Grade ");
        }
        else
        {
            System.out.println(" F Grade");
        }
    }

    public static void main(String[] args)
    {
        printGrade();
    }
}
