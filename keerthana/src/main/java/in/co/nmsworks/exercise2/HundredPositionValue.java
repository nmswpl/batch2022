/*8.Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven.

 */



package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class HundredPositionValue
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 digit number:");
        int no= input.nextInt();
        int result = 0;
        while(no!=0)
        {
        result=no/100;
        break;

        }
        System.out.println("Hundred Position Value: "+result);
        String[] arr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0;i< arr.length;i++)
        {
            if(i==result)
            {
                System.out.println("No in words: "+arr[i]);
            }
        }




    }
}
