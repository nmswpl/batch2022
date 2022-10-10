/*16. Display Fibonacci Series Using for Loop

 */


package in.co.nmsworks.exercise;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no:");
        int no= input.nextInt();
        int firstNo=0;
        int secondNo=1;
        int thirdNo=0;
        System.out.print(firstNo+" "+secondNo+" ");
        for(int i=2;i<=no;i++)
        {
            thirdNo=firstNo+secondNo;
            firstNo=secondNo;
            secondNo=thirdNo;
            System.out.print(thirdNo+" ");
        }


    }
}
