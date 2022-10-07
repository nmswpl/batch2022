package in.co.nmsworks.excercise2;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        int x,i;
        Scanner inputObject=new Scanner(System.in);
        x=inputObject.nextInt();
        for ( i=2; i<x; i++)
        {
            if(x%i==0)
            {
                break;
            }
        }
        if(i==x)
        {
            System.out.println("It is Prime Number");
        }
        else
        {
            System.out.println("It is Not Prime Number");
        }
    }
}
