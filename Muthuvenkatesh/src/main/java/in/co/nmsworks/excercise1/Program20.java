// 20. Calculate the power of a number using pow() function
import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Number : ");
        double base = input.nextInt();
        System.out.print("Enter Power : ");
        double power = input.nextInt();
        double result = Math.pow(base,power);
        System.out.println("Answer = " + result);

    }
}
