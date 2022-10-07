package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int findFactorial;
        FactorialUsingRecursion classObject=new FactorialUsingRecursion();
        Scanner inputObject=new Scanner(System.in);
        findFactorial=inputObject.nextInt();
        int factorial=classObject.findFactorial(findFactorial);
        System.out.println("Result is "+factorial);
    }
    public int findFactorial(int findFactorial)
    {
        if(findFactorial==0)
        {
            return 1;
        }
        else
        {
            return findFactorial*(findFactorial(findFactorial-1));
        }
    }
}
