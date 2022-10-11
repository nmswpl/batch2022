package in.co.nmsworks.exercise;
//18. Count Number of Digits in an Integer using while loop
import java.util.Scanner;

public class DigitCount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no ");
        int CheckNo = in.nextInt();
        int count =0;
        while (CheckNo!=0)
        {
            int remainder = CheckNo%10;
            count++;
            int temp = CheckNo/10;
            CheckNo = temp;
        }
        System.out.println("No of Digit is : "+count);
    }
}
