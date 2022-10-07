package in.co.nmsworks.exercise1;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();
        int count=0;
        while (number>0)
        {
            number=number/10;
            count++;

        }
        System.out.println(count);
    }
}
