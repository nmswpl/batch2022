import java.util.Scanner;
// 2. Write a Program to Add Two Integers
public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1=input.nextInt();
        int number2 = input.nextInt();
        System.out.println("The Sum is: "+ (number1+number2));
    }
}
