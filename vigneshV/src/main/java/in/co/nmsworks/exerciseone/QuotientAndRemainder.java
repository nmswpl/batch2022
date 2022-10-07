package in.co.nmsworks.exerciseone;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        int divisibleNumber,dividedNumber;
        Scanner inputObject=new Scanner(System.in);
        System.out.println("Enter the divisible number & dividided number:");
        divisibleNumber= inputObject.nextInt();
        dividedNumber= inputObject.nextInt();
        System.out.println("Quotient = "   +(divisibleNumber/dividedNumber)+"\n"+
                            "Remainder = "+(divisibleNumber%dividedNumber));
    }
}
