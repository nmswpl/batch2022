package in.co.nmsworks.exercise1;

import java.util.Scanner;
//factorial using while loop
public class FactorialUsingWhileLoop
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int numbers = S.nextInt();
        int fact = 1;

        int i = 1;
        while( i <= numbers)
        {
            fact = fact * i ;
            i++;
        }
        System.out.println(fact);
    }
}
