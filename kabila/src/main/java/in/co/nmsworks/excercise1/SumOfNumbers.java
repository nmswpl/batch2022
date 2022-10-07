package in.co.nmsworks.training.practice;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        int sum= number1+number2;
        System.out.println("sum is " + sum);

        
    }
}
