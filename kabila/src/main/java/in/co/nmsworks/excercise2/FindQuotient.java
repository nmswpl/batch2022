package in.co.nmsworks.excercise2;

import java.util.Scanner;

public class FindQuotient {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int number1 = number.nextInt();
        int number2 = number.nextInt();
        int quotient= number1/number2;
        int reminder= number1%number2;
        System.out.println("quotient "+ quotient +" \nreminder "+ reminder);
    }
}
