package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int num = number.nextInt();
        System.out.println( "Factors of " + num + " are " );
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }

    }
}
