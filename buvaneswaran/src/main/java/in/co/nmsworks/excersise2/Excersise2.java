package in.co.nmsworks.excersise2;

import java.util.Scanner;

public class Excersise2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Mark :");
        int mark= sc.nextInt();sc.nextLine();

        if(mark>91 && mark<=100)
        {
            System.out.println("Grade is S");
        }
        else if(mark>81 && mark<=90)
        {
            System.out.println("Grade is A");
        }
        else if(mark>71 && mark<=80)
        {
            System.out.println("Grade is B");
        }
        else if(mark>61 && mark<=70)
        {
            System.out.println("Grade is C");
        }
        else if(mark>51 && mark<=60)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
