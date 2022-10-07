import java.util.Scanner;

public class EQuatiantAndRemainder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dividend = 10;
        System.out.print("Enter a Divisor : ");
        int divisor = inp.nextInt();

        int quationt = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quationt = "+quationt);
        System.out.println("Remainder = "+remainder);
    }
}
