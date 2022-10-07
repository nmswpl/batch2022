// 7. Check whether a number is even or odd using if...else statement
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        if(num1 % 2 == 0){
            System.out.println(num1 + " is even");
        }
    }
}
