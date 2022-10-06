// 13. Write a program to Find Factorial of a number using for loop
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+ number +" is "+fact);
    }
}
