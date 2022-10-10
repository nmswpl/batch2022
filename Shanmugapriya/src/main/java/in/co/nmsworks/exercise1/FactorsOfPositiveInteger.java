package in.co.nmsworks.exercise1;

import java.util.Scanner;
//factors of positive integer
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
