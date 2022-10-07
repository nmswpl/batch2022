package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        int a=-1,b=1,c,findFibonacci;
        Scanner inputObject=new Scanner(System.in);
        findFibonacci=inputObject.nextInt();
        System.out.printf("Fibonacci series till %d terms",findFibonacci);
        for (int i=0; i<findFibonacci; i++)
        {
            c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;
        }
    }
}
