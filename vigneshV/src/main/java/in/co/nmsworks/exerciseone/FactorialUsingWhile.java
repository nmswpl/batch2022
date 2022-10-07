package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String[] args) {
        int i=1,fact=1,findFactorialNumber;
        Scanner input=new Scanner(System.in);
        findFactorialNumber=input.nextInt();
        while (i<=findFactorialNumber)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+findFactorialNumber+" = "+fact);
    }
}
