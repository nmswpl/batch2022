package in.co.nmsworks.exercise1;
//Check whether a number is even or odd using if...else statement
import java.util.Scanner;

public class practice7
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A NUMBER: ");
        Scanner no = new Scanner(System.in);
        int num = no.nextInt();
        if(num % 2 ==0)
        {
            System.out.println(+num +" is even");
        }
        else
        {
            System.out.println(+num +" is odd");
        }

    }
}
