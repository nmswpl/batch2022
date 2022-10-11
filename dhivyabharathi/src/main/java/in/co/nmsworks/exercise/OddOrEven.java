package in.co.nmsworks.exercise;
//7. Check whether a number is even or odd using if...else statement
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no");
        int n1 = in.nextInt();
        if(n1%2 ==0)
        {
            System.out.println("Given no is even  : "+n1);
        }
        else
            System.out.println("Given no is odd  : "+n1);
    }
}
