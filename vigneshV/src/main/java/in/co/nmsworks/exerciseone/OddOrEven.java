package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int checkingNumber;
        Scanner inputObject=new Scanner(System.in);
        System.out.print("Enter a number: ");
        checkingNumber=inputObject.nextInt();
        if(checkingNumber%2==0)
        {
            System.out.println(checkingNumber+" is even");
        }
        else
        {
            System.out.println(checkingNumber+" is odd");
        }
    }
}
