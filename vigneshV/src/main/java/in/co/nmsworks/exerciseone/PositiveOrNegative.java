package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        int checkNumber;
        Scanner inputObject=new Scanner(System.in);
        checkNumber=inputObject.nextInt();
        if(checkNumber>=0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}
