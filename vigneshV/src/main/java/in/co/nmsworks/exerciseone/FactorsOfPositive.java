package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class FactorsOfPositive {
    public static void main(String[] args) {
        int factorNumber;
        Scanner inputObject=new Scanner(System.in);
        factorNumber=inputObject.nextInt();
        for (int i=1; i<=factorNumber; i++)
        {
            if (factorNumber%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
