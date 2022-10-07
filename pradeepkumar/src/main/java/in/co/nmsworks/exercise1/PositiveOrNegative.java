package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();

        if(n>=0)
        {
            System.out.println(n + "is a positive number");
        }
        else
        {
            System.out.println(n + "is a negative number");
        }
    }
}
