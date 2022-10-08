package in.co.nmsworks.training.program.exercise;

import java.util.Scanner;

public class EnterAndPrintNumber
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = S.nextInt();

        System.out.println("The number is : "+num);

    }
}
