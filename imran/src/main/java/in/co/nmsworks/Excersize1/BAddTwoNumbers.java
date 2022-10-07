import java.util.Scanner;

public class BAddTwoNumbers
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : "+sum);
    }
}