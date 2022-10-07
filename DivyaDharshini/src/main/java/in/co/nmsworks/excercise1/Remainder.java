package in.co.nmsworks.excercise1;
import java.util.*;

public class Remainder {
        public static void main(String[] args) {
            Scanner val=new Scanner(System.in);
            System.out.println("Enter dividend no and divisor");
            int dividend=val.nextInt();
            int divisor=val.nextInt();
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }

}
