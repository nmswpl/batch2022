package in.co.nmsworks.exercise1;

import java.util.Scanner;
// Swap Two Values
public class SwapValues
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2 : ");
        int number2 = scanner.nextInt();
        System.out.println("---------Before Swap ----------------");
        System.out.println("Number 1 is "  + number1);
        System.out.println("Number 2 is " + number2);
        System.out.println("---------After Swap---------------");
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Number 1 is " + number1);
        System.out.println("Number 2 is " + number2);
    }
}
