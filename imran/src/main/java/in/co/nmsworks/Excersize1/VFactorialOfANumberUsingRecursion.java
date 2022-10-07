import java.util.Scanner;

public class VFactorialOfANumberUsingRecursion {
    public static long fact(int num)
    {
        if(num >= 1 )
        {
        
            return num * fact(num - 1);
            
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        long factorial = fact(number);
        System.out.println("Factorial of  "+number +" : "+ factorial) ;
    }
}