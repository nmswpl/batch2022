package in.co.nmsworks.exercise2;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= scanner.nextInt();
        for (int i = 1; i <=number; i++) {
            if (number%i==0)
            {
                count++;
            }

        }
        if (count==2)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is not a prime");
        }
    }
}
