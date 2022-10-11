package in.co.nmsworks.exercise;
//19. Calculate the power of a number using a for loop
import java.util.Scanner;

public class PowerBase
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Base Number");
        int  BaseNumber = in.nextInt();
        System.out.println("Enter the Power Number");
        int PowerNumber = in.nextInt();
        int result=1;
        for(;PowerNumber!=0;PowerNumber--)
        {
            result=result*BaseNumber;
        }
        System.out.println("Answer is = "+result);
    }
}
