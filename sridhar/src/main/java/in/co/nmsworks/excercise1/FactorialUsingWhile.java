package in.co.nmsworks.excercise1;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String[] args) {
        int i=1,fact=1,findFactorialNumber;
        Scanner inputObject=new Scanner(System.in);
        findFactorialNumber=inputObject.nextInt();
        while (i<=findFactorialNumber)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+findFactorialNumber+" = "+fact);
    }
}
