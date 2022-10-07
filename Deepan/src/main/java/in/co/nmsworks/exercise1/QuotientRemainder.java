import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        int num1 = get.nextInt();
        int num2 = get.nextInt();

        int qoutient = num1/num2;
        int remainder = num1%num2;

        System.out.println("Quotient: "+qoutient);
        System.out.println("Remainder:"+remainder);
    }
}
