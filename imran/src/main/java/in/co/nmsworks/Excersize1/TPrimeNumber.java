import java.util.Scanner;

public class TPrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        int count = 0;
        for (int i = 2 ; i  <=number/2 ; i++)
        {
            if(number % i == 0)
            {
                count ++;
                break;
               
            }
        }
        if(count == 0)
        {
            System.out.println(number +" is prime number" );
        }
        else
        {
            System.out.println(number +" is not a prime number" );

        }
    }
}
