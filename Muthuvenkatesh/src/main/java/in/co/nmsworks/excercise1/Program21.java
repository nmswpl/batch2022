// 21. Write a program to Check Prime Number using a for loop
import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter a number ");
        int number = input.nextInt();
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if(!flag){
            System.out.println(number + " is not a prime number");
        }
        else{
            System.out.println(number + " is a prime number");
        }
    }
}
