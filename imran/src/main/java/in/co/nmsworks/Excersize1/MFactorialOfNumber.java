import java.util.Scanner;

public class MFactorialOfNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number ; i++)
        {
            factorial *= i ;
        }
        System.out.println("Factorial of "+number+ " : " +factorial);
    }
}
