package in.co.nmsworks.excersise1;

import java.util.Scanner;

public class PrintInteger
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n= scanner.nextInt();
        scanner.nextLine();
        System.out.println("You Entered :" + n);
    }
}
