package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        int findFactorialNumber,fact=1;
        Scanner inputObject=new Scanner(System.in);
        findFactorialNumber=inputObject.nextInt();
        for (int i=1;i<=findFactorialNumber;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+findFactorialNumber+" = "+fact);
    }
}
