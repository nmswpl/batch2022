package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        int checkNumber,flag=0;
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter a number: ");
        checkNumber=inputObject.nextInt();
        for (int i=2; i<=checkNumber/2; i++)
        {
            if(checkNumber%i==0)
            {
                flag=1;
                System.out.println(checkNumber+" is not prime number");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(checkNumber+" is prime number");
        }
    }
}
