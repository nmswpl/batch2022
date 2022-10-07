// 12. Write a program to find the Sum of Natural Numbers using for loop
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int number = input.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
            sum = sum + i;
        }
        System.out.println("The Sum is " + sum);

    }
}
