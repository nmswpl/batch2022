import java.util.Scanner;
public class NFIndFactorialUsingWhile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        int factorial = 1;
        int i =1;
        while(i <= number)
        {
            factorial *= i ;
        }
        System.out.println("Factorial of "+number+ " : " +factorial);
    }
}
