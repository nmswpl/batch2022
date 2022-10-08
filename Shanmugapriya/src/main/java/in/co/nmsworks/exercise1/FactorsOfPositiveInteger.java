package in.co.nmsworks.exercise;

import java.util.Scanner;

public class FactorsOfPositiveInteger
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = S.nextInt();

        System.out.println("The Factors of "+num+" are ");
        for ( int i = 1; i <= num; i++){
            if(num % i == 0)
            {
                System.out.print(i+",");
            }
        }
    }
}
