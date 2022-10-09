package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class Factors
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();scanner.nextLine();
        for (int i=1;i<=num;i++)
        {
           if (num%i==0)
           {
               System.out.println("Factors :" + i);
           }
        }
    }
}
